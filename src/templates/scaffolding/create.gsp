<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="\${message(code: '${domainClass.propertyName}.label', default: '${className}')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
	<section class="tzpage-default">
	        <div class="container">
	            <div class="joom-registration">
					<div id="create-${domainClass.propertyName}" class="content scaffold-create" role="main">
						<h1><g:message code="default.create.label" args="[entityName]" /></h1>
			            <div class="form-button">
				           	<g:link class="tz-button-dekor" action="index"><span><g:message code="default.list.label" args="[entityName]" /></span></g:link>
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
							<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
								<g:form class="form-horizontal" url="[resource:${propertyName}, action:'save']" <%= multiPart ? ' enctype="multipart/form-data"' : '' %>>
									
									<g:render template="form"/>
									
									<div class="row form-button">
										<g:submitButton name="create" class="save" value="\${message(code: 'default.button.create.label', default: 'Create')}" />
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
