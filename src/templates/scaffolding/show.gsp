<% import grails.persistence.Event %>
<%=packageName%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="\${message(code: '${domainClass.propertyName}.label', default: '${className}')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<section class="tzpage-default">
	        <div class="container">
	            <div class="joom-registration">
            		<div id="show-${domainClass.propertyName}" class="content scaffold-show" role="main">
						<h1><g:message code="default.show.label" args="[entityName]" /></h1>
							<div class="form-button">
				            	<g:link class="tz-button-dekor" action="index"><span><g:message code="default.list.label" args="[entityName]" /></span></g:link>
				            	<g:link class="tz-button-dekor" action="create"><span><g:message code="default.new.label" args="[entityName]" /></span></g:link>
			                </div>
						<g:if test="\${flash.message}">
						<div class="message" role="status">\${flash.message}</div>
						</g:if>
						<div class="row">
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<g:form class="form-horizontal" url="[resource:${propertyName}, action:'delete']" method="DELETE">
									<div class="property-list ${domainClass.propertyName}">
									<%  excludedProps = Event.allEvents.toList() << 'id' << 'version' << 'scaffoldingControllerName'
										allowedNames = domainClass.persistentProperties*.name << 'dateCreated' << 'lastUpdated'
										props = domainClass.properties.findAll { allowedNames.contains(it.name) && !excludedProps.contains(it.name) && (domainClass.constrainedProperties[it.name] ? domainClass.constrainedProperties[it.name].display : true) }
										Collections.sort(props, comparator.constructors[0].newInstance([domainClass] as Object[]))
										props.each { p -> %>
										<g:if test="\${${propertyName}?.${p.name}}">
										<div class="row fieldcontain">
											<div class="col-lg-2 col-md-2 col-sm-12 col-xs-12">
												<label class="form-label"><span id="${p.name}-label" class="property-label"><g:message code="${domainClass.propertyName}.${p.name}.label" default="${p.naturalName}" /></span></label>
											</div>
											<%  if (p.isEnum()) { %>
												<div class="col-lg-10 col-md-10 col-sm-12 col-xs-12">
													<span class="property-value" aria-labelledby="${p.name}-label"><g:fieldValue bean="\${${propertyName}}" field="${p.name}"/></span>
												</div>
											<%  } else if (p.oneToMany || p.manyToMany) { %>
												<div class="col-lg-10 col-md-10 col-sm-12 col-xs-12">
												<g:each in="\${${propertyName}.${p.name}}" var="${p.name[0]}">
													<div>
													<span class="property-value" aria-labelledby="${p.name}-label"><g:link controller="${p.referencedDomainClass?.propertyName}" action="show" id="\${${p.name[0]}.id}">\${${p.name[0]}?.encodeAsHTML()}</g:link></span>
													</div>
												</g:each>
												</div>
											<%  } else if (p.manyToOne || p.oneToOne) { %>
												<div class="col-lg-10 col-md-10 col-sm-12 col-xs-12">
													<span class="property-value" aria-labelledby="${p.name}-label"><g:link controller="${p.referencedDomainClass?.propertyName}" action="show" id="\${${propertyName}?.${p.name}?.id}">\${${propertyName}?.${p.name}?.encodeAsHTML()}</g:link></span>
												<%
												def cp = domainClass.constrainedProperties[p.name]
												if ("imagebed" == cp.widget) {%>
													<g:render template="single-photo"
													contextPath="/uploader" model="\${[fieldName:'${p.name}', photo:${propertyName}?.${p.name}, editable: false]}" />
												<%}%>
												</div>
											<%  } else if (p.type == Boolean || p.type == boolean) { %>
												<div class="col-lg-10 col-md-10 col-sm-12 col-xs-12">
													<span class="property-value" aria-labelledby="${p.name}-label"><g:formatBoolean boolean="\${${propertyName}?.${p.name}}" /></span>
												</div>
											<%  } else if (p.type == Date || p.type == java.sql.Date || p.type == java.sql.Time || p.type == Calendar) { %>
												<div class="col-lg-10 col-md-10 col-sm-12 col-xs-12">
													<span class="property-value" aria-labelledby="${p.name}-label"><g:formatDate date="\${${propertyName}?.${p.name}}" /></span>
												</div>
											<%  } else if (!p.type.isArray()) { %>
												<div class="col-lg-10 col-md-10 col-sm-12 col-xs-12">
													<span class="property-value" aria-labelledby="${p.name}-label"><g:fieldValue bean="\${${propertyName}}" field="${p.name}"/></span>
												</div>
											<%  } %>
										</div>
										</g:if>
									<%  } %>
									<% if (domainClass.getClazz() in org.grails.taggable.Taggable) { %>
										<div class="row fieldcontain">
											<div class="col-lg-2 col-md-2 col-sm-12 col-xs-12">
												<label class="form-label"><span id="tags-label" class="property-label"><g:message code="${domainClass.propertyName}.tags.label" default="Tags" /></span></label>
											</div>
											<div class="col-lg-10 col-md-10 col-sm-12 col-xs-12">
												<span class="property-value" aria-labelledby="tags-label"><g:fieldValue bean="\${${propertyName}}" field="tags"/></span>
											</div>
										</div>
									<%  } %>
									</div>
									<div class="row form-button">
										<g:link class="edit" action="edit" resource="\${${propertyName}}"><input type="button" value="<g:message code="default.button.edit.label" default="Edit" />"></input></g:link>
										<g:actionSubmit class="delete" action="delete" value="\${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('\${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
									</div>
								</g:form>
							</div>
						</div>
					</div>
	            </div><!--end class joom-->
	        </div><!--end class container-->
	    </section>
	</body>
</html>
