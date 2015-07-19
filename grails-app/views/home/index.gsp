<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="${pageData.layoutName}"/>
    <title>${pageData.title }</title>
</head>
<body>

    <section class="tz-about tz-about2 theme-white">
		<g:render template="w_about" />
    </section><!--end class tz-about-->

    <section class="tz-portfolio">
		<g:render template="w_portfolio" />
    </section><!--end class tz-portfolio-->

    <section class="tz-our-team theme-white">
    	<g:render template="w_ourteam" />
    </section><!--end class tz-our-team-->

    <section class="tz-free-shipping theme-orange">
		<g:render template="w_freeshipping" />
    </section><!--end class tz-free-shipping-->

    <section class="tz-lastest-shop theme-white shop-style2">
		<g:render template="w_latestshop" />
    </section><!--end class tz-lastest-shop-->
    
    <section class="tz-partner theme-gray">
		<g:render template="w_partner" />
    </section><!--end class partner-->
    
</body>
</html>