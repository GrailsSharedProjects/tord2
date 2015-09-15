<%=packageName%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="\${message(code: '${domainClass.propertyName}.label', default: '${className}')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
	</head>
	<body>
	<section class="tzpage-default">
	        <div class="container">
	            <div class="joom-registration">
					<div id="edit-${domainClass.propertyName}" class="content scaffold-edit" role="main">
						<h1><g:message code="default.edit.label" args="[entityName]" /></h1>
						<div class="form-button">
				           	<g:link class="tz-button-dekor" action="index"><span><g:message code="default.list.label" args="[entityName]" /></span></g:link>
				           	<g:link class="tz-button-dekor" action="create"><span><g:message code="default.new.label" args="[entityName]" /></span></g:link>
			            </div>
						<g:if test="\${flash.message}">
						<div class="message" role="status">\${flash.message}</div>
						</g:if>
						<g:hasErrors bean="\${${propertyName}}">
						<ul class="errors" role="alert">
							<g:eachError bean="\${${propertyName}}" var="error">
							<li <g:if test="\${error in org.springframework.validation.FieldError}">data-field-id="\${error.field}"</g:if>><g:message error="\${error}"/></li>
							</g:eachError>
						</ul>
						</g:hasErrors>
						<div class="row">
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<g:form class="form-horizontal" url="[resource:${propertyName}, action:'update']" method="PUT" <%= multiPart ? ' enctype="multipart/form-data"' : '' %>>
									<g:hiddenField name="version" value="\${${propertyName}?.version}" />
									
									<g:render template="form"/>
									
									<div class="row form-button">
										<g:actionSubmit class="save" action="update" value="\${message(code: 'default.button.update.label', default: 'Update')}" />
										<g:actionSubmit id="ref-btn" class="refresh" action="refreshEdit" value="Refresh" />
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
