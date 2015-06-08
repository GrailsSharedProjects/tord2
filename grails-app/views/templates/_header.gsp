    <%@page import="com.tord.admin.HeaderStyle"%>
    <header class="tz-header <g:if test='${style == HeaderStyle.LIGHT }'>tz-header3</g:if><g:elseif test='${style == HeaderStyle.FIXED_DARK }'>tz-header2</g:elseif>">
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
                	<g:each in="${pageData.header.menu}" var="menu">
                	<li>
                        <a href="${createLink(controller: menu.controller, action: menu.action, url: menu.url)}">
                        <g:if test="menu.icon"><span><i class='fa ${menu.icon}'></i></span></g:if> ${menu.title }</a>
                        <g:renderMenu menu="${menu}"/>
                    </li>
                	</g:each>
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
    