<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head><meta charset="utf-8">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		
		<title><g:layoutTitle default="Tord"/></title>
		
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
		<meta name="description" content="拓德是行业领先的一站式家装O2O平台"/>
		<meta name="keywords" content="拓德,Tord,tord,装修,成都装修,一站式装修平台,一站式家装O2O平台,家装O2O,拓德装饰,拓德进出口贸易有限公司,家装建材,瓷砖,墙面砖,瓷砖批发"/>
		
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.jpg')}">
		<link rel="apple-touch-icon" sizes="72x72" href="${assetPath(src: 'apple-touch-icon-72x72.jpg')}"/>
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-114x114.jpg')}"/>
		
		<g:if test="${pageData.sliderRevolution }">
  		<!-- Global Css With Revolution Slider-->
  		<asset:stylesheet src="site-rs.css"/>
  		</g:if>
  		<g:else>
  		<!-- Global Css -->
  		<asset:stylesheet src="site.css"/>
  		</g:else>
  		
    	<g:if test="${pageData.customCss }">
  		<!-- Custom CSS -->
    	<link type="text/css" href="${resource(dir: 'css', file: pageData.customCss)}" />
    	</g:if>
  		
    	<g:if test="${pageData.sliderRevolution }">
		<!-- Global JavaScript with Revolution Slider  -->
		<asset:javascript src="site-rs.js"/>
    	</g:if>
    	<g:else>
    	<!-- Global JavaScript -->
		<asset:javascript src="site.js"/>
    	</g:else>
    	
    	<!-- Support for HTML5 -->
	    <!--[if lt IE 9]>
	    <asset:javascript src="html5.js"/>
	    <![endif]-->
	
	    <!-- Enable media queries on older bgeneral_rowsers -->
	    <!--[if lt IE 9]>
	    <asset:javascript src="respond.min.js"/>
	    <![endif]-->
    	
    	<g:if test="${pageData.customJavaScript }">
    	<!-- Custom JavaScript -->
    	<script src="${resource(dir:'js', file:pageData.customJavaScript) }" type="text/javascript"></script>
    	</g:if>
		
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
    	<g:render template="header" contextPath="/layouts" model="['header':com.tord.admin.Header.findByName('PAGE_HEADER')]" />
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
    	<!-- Revolution Slider  -->
		<g:if test="${pageData.sliderRevolution }">
    		<g:render template="rev_slider" contextPath="/templates"/>
    	</g:if>
    	<!-- Body  -->
		<g:layoutBody/>
		<!-- Footer  -->
    	<g:render template="footer" contextPath="/layouts" model="['footer':com.tord.admin.Footer.findByName('PAGE_FOOTER')]" />
    	
	</body>
</html>
