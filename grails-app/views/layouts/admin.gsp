<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head><meta charset="utf-8">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		
		<title><g:layoutTitle default="Title"/></title>
		
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
		
<%--		<meta name="description" content=""/>--%>
<%--		<meta name="keywords" content=""/>--%>
		
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.jpg')}">
		<link rel="apple-touch-icon" sizes="72x72" href="${assetPath(src: 'apple-touch-icon-72x72.jpg')}"/>
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-114x114.jpg')}"/>		
		
  		<asset:stylesheet src="admin.css"/>
  		
	    <!-- Support for HTML5 -->
	    <!--[if lt IE 9]>
	    <asset:javascript src="html5.js"/>
	    <![endif]-->
	
	    <!-- Enable media queries on older bgeneral_rowsers -->
	    <!--[if lt IE 9]>
	    <asset:javascript src="respond.min.js"/>
	    <![endif]-->
		
		<asset:javascript src="jquery.min.js" />
		<asset:javascript src="scripts/module.js" />
		<asset:javascript src="scripts/hotkeys.js" />
		<asset:javascript src="scripts/uploader.js" />
		<asset:javascript src="scripts/simditor.js" />
		
		<g:layoutHead/>
		
	</head>
	<body>
	
		<div class="page-loader">
			<div class="loader-in">
				<div class="status">
					<span class="spin"></span>
					<span></span>
				</div>
			</div>
		</div>
		
		<!-- Header  -->
    	<g:render template="header" contextPath="/templates" model="['style':pageData.header.style]" />
    	<!-- Message -->
    	<g:if test="${flash.message}">
		<div id="flash-message" class="alert alert-danger alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<strong>注意！</strong> ${flash.message }
		</div>
		</g:if>
    	<!-- Body  -->
		<g:layoutBody/>
		<!-- Footer  -->
<%--    	<g:render template="footer" contextPath="/templates" />--%>
    	
    	<asset:javascript src="admin.js"/>
	</body>
</html>
