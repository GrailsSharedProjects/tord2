<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<title><g:layoutTitle default="Title" /></title>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />

<%--		<meta name="description" content=""/>--%>
<%--		<meta name="keywords" content=""/>--%>

<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}"
	type="image/x-icon">
<link rel="apple-touch-icon"
	href="${assetPath(src: 'apple-touch-icon.jpg')}">
<link rel="apple-touch-icon" sizes="72x72"
	href="${assetPath(src: 'apple-touch-icon-72x72.jpg')}" />
<link rel="apple-touch-icon" sizes="114x114"
	href="${assetPath(src: 'apple-touch-icon-114x114.jpg')}" />

<asset:stylesheet src="site.css" />

<!-- Support for HTML5 -->
<!--[if lt IE 9]>
	    <asset:javascript src="html5.js"/>
	    <![endif]-->

<!-- Enable media queries on older bgeneral_rowsers -->
<!--[if lt IE 9]>
	    <asset:javascript src="respond.min.js"/>
	    <![endif]-->

<g:layoutHead />

</head>
<body>

	<div class="page-loader">
		<div class="loader-in">
			<div class="status">
				<span class="spin"></span> <span></span>
			</div>
		</div>
	</div>
	
	<!-- Header -->
    <header class="tz-header">
        <div class="container">
            <h3 class="tz-logo pull-left">
                <a href="${createLink(controller: 'home')}">
                    <img src="${assetPath(src: 'tord_small.png')}" alt="LOGO">
                </a>
            </h3>
            <button data-target=".nav-collapse" class="btn-navbar tz_icon_menu pull-right" type="button">
                <i class="fa fa-bars"></i>
            </button>
            <button class="pull-right tz-search"> <i class="fa fa-search"></i></button>
            <nav class="pull-right">
                <ul class="nav-collapse">
                	<li>
                		<a href="${createLink(controller: 'home', action: 'index')}">首页</a>
                    </li>
                </ul>
            </nav>
        </div><!--end class container-->
        <div class="tz-form-search">
            <div class="container">
                <form method="get" action="#">
                    <input type="text" placeholder="Search..." name="search" id="tz-search-input" class="tz-search-input">
                    <input class="hidden" type="submit" value="Search">
                    <i class="fa fa-times tz-form-close"></i>
                </form>
            </div>
        </div><!--end class tz-form-search-->
    </header><!--end class tz-header-->
    
    <!-- Body -->
	<g:layoutBody />

	<asset:javascript src="site.js" />
</body>
</html>
