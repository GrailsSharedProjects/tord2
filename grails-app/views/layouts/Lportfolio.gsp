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
		
  		<asset:stylesheet src="Aportfolio.css"/>
  		
	    <!-- Support for HTML5 -->
	    <!--[if lt IE 9]>
	    <asset:javascript src="html5.js"/>
	    <![endif]-->
	
	    <!-- Enable media queries on older bgeneral_rowsers -->
	    <!--[if lt IE 9]>
	    <asset:javascript src="respond.min.js"/>
	    <![endif]-->
		
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
    	<g:render template="${pageData.header.style.template }" contextPath="/layouts" />
		<g:layoutBody/>
    	<g:render template="footer" contextPath="/layouts" />
    	
    	<asset:javascript src="Aportfolio.js"/>
	</body>
</html>
