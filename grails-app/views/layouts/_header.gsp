<%@page import="com.tord.admin.HeaderStyle"%>
<g:if test="${HeaderStyle.HIDDEN_ON_LEFT == header.style }">
	    <header class="tz-header4 tz-header2">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                    <button class="tz-offcavas pull-left">
                        <i class="fa fa-bars"></i>
                    </button>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <h3 class="tz-logo">
						<span>后台管理</span>
                    </h3>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
				<%--
                    <a class="tz-shop-cart pull-right">
                        <i class="fa fa-shopping-cart "></i>
                        $ 2.000
                    </a> 	
				--%>
                    <button class="tz-search pull-right"> <i class="fa fa-search"></i></button>
                </div>
            </div>
        </div><!--end class container-->
        <div class="tz-form-search">
            <div class="container">
                <form action="#" method="get">
                    <input type="text" class="tz-search-input" id="tz-search-input" name="search" placeholder="Search...">
                    <input type="submit" value="Search" class="hidden">
                    <i class="fa fa-times tz-form-close"></i>
                </form>
            </div>
        </div><!--end class tz-form-search-->
    </header>

    <aside class="tz-offcavans-menu" style="width: 12em">
        <button class="tz-offcanvas-close"><i class="fa fa-times"></i></button>
        <div class="tzscrollable">
            <h3 class="tz-offcavans-logo" style="width: 5em">
            </h3>
            <nav class="tz-menu-left">
                <ul>
                	<g:each in="${header.menu}" var="menu">
                    <li>
                        <a href="${createLink(controller: menu.controller, action: menu.action, url: menu.url)}">
                        <g:if test="menu.icon"><span><i class='fa ${menu.icon}'></i></span></g:if> ${menu.title }</a>
                    </li>
                	</g:each>
                	<li>
                    	<sec:ifLoggedIn>
                        <g:form method="post" controller="logout">
							<a><sec:username/>
							<input type="submit" value="登出"/></a>
						</g:form>
                    	</sec:ifLoggedIn>
						<sec:ifNotLoggedIn>
                    	<g:link controller="login">
                        <span><i class="fa fa-sign-in"></i></span> 登录</g:link>
                        </sec:ifNotLoggedIn>
                    </li>
                </ul>
            </nav>
        </div>
    </aside>
</g:if>
<g:else>
    <header class="tz-header <g:if test='${header.style == HeaderStyle.LIGHT }'>tz-header3</g:if><g:elseif test='${header.style == HeaderStyle.FIXED_DARK }'>tz-header2</g:elseif>">
        <div class="container">
            <h3 class="tz-logo pull-left">
                <g:renderLogo />
            </h3>
            <button data-target=".nav-collapse" class="btn-navbar tz_icon_menu pull-right" type="button">
                <i class="fa fa-bars"></i>
            </button>
            <button class="pull-right tz-search"> <i class="fa fa-search"></i></button>
            <nav class="pull-right">
                <ul class="nav-collapse">
                	<g:each in="${header.menu}" var="menu">
                	<li>
                        <a href="${createLink(controller: menu.controller, action: menu.action, url: menu.url)}">
                        <g:if test="menu.icon"><span><i class='fa ${menu.icon}'></i></span></g:if> ${menu.title }</a>
                        <g:renderMenu menu="${menu}"/>
                    </li>
                	</g:each>
                    <li>
                    	<sec:ifLoggedIn>
                        <g:form method="post" controller="logout">
							<a><sec:username/>
							<input type="submit" value="登出"/></a>
						</g:form>
                    	</sec:ifLoggedIn>
						<sec:ifNotLoggedIn>
                    	<g:link controller="login">
                        <span><i class="fa fa-sign-in"></i></span> 登录</g:link>
                        </sec:ifNotLoggedIn>
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
</g:else>