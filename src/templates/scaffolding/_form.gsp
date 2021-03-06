<%=packageName%>
<% import grails.persistence.Event %>

<%  excludedProps = Event.allEvents.toList() << 'version' << 'dateCreated' << 'lastUpdated' << 'scaffoldingControllerName'
	persistentPropNames = domainClass.persistentProperties*.name
	boolean hasHibernate = pluginManager?.hasGrailsPlugin('hibernate') || pluginManager?.hasGrailsPlugin('hibernate4')
	if (hasHibernate) {
		def GrailsDomainBinder = getClass().classLoader.loadClass('org.codehaus.groovy.grails.orm.hibernate.cfg.GrailsDomainBinder')
		if (GrailsDomainBinder.newInstance().getMapping(domainClass)?.identity?.generator == 'assigned') {
			persistentPropNames << domainClass.identifier.name
		}
	}
	props = domainClass.properties.findAll { persistentPropNames.contains(it.name) && !excludedProps.contains(it.name) && (domainClass.constrainedProperties[it.name] ? domainClass.constrainedProperties[it.name].display : true) }
	Collections.sort(props, comparator.constructors[0].newInstance([domainClass] as Object[]))
	for (p in props) {
		if (p.embedded) {
			def embeddedPropNames = p.component.persistentProperties*.name
			def embeddedProps = p.component.properties.findAll { embeddedPropNames.contains(it.name) && !excludedProps.contains(it.name) }
			Collections.sort(embeddedProps, comparator.constructors[0].newInstance([p.component] as Object[]))
			%><fieldset class="embedded"><legend><g:message code="${domainClass.propertyName}.${p.name}.label" default="${p.naturalName}" /></legend><%
				for (ep in p.component.properties) {
					renderFieldForProperty(ep, p.component, "${p.name}.")
				}
			%></fieldset><%
		} else {
			renderFieldForProperty(p, domainClass)
		}
	}

private renderFieldForProperty(p, owningClass, prefix = "") {
	boolean hasHibernate = pluginManager?.hasGrailsPlugin('hibernate') || pluginManager?.hasGrailsPlugin('hibernate4')
	boolean required = false
	if (hasHibernate) {
		cp = owningClass.constrainedProperties[p.name]
		required = (cp ? !(cp.propertyType in [boolean, Boolean]) && !cp.nullable : false)
	}
	%>
<div class="row fieldcontain \${hasErrors(bean: ${propertyName}, field: '${prefix}${p.name}', 'error')} ${required ? 'required' : ''}">
	<div 
		<%if(cp?.widget=="textarea"){%>
		class="col-lg-12 col-md-12 col-sm-12 col-xs-12"
		<%}else{%>
		class="col-lg-2 col-md-2 col-sm-12 col-xs-12"
		<%}%>
	>
		<label class="form-label" for="${prefix}${p.name}">
			<g:message code="${domainClass.propertyName}.${prefix}${p.name}.label" default="${p.naturalName}" />
			<% if (required) { %><span class="required-indicator">*</span><% } %>
		</label>
	</div>
	<div 
		<%if(cp?.widget=="textarea"){%>
		class="col-lg-12 col-md-12 col-sm-12 col-xs-12"
		<%}else{%>
		class="col-lg-10 col-md-10 col-sm-12 col-xs-12"
		<%}%>
	>
		${renderEditor(p)}
	</div>
	
</div>
<%  } %>


<% 
if (domainClass.getClazz() in org.grails.taggable.Taggable) { %>
<div class="row fieldcontain \${hasErrors(bean: ${propertyName}, field: 'tags', 'error')}">
	<div class="col-lg-2 col-md-2 col-sm-12 col-xs-12">
		<label class="form-label" for="tags">
			<g:message code="${domainClass.propertyName}.tags.label" default="Tags" />
		</label>
	</div>
	<div class="col-lg-10 col-md-10 col-sm-12 col-xs-12">
		<g:render template="form-tags" contextPath="/templates" model="\${[fieldName:'tags', target: ${propertyName}.tags]}" />
	</div>
</div>
<%  } %>
