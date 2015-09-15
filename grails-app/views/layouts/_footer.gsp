<%@page import="com.tord.admin.SiteSettings"%>
    <footer>
        <div class="tz-footer-content">
            <div class="container">
                <div class="row">
                	<g:each in="${1..4 }" var="idx">
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 footer-item">
                        <h3 class="module-title">
                            <span>
                                ${footer['module'+idx].title }
                            </span>
                        </h3>
						<g:if test="${footer['module'+idx].type == 'html'}">
                        <div class="textwidget">
                        	${raw(footer['module'+idx].contentHTML) }
                        </div>
						</g:if>
						<g:elseif test="${footer['module'+idx].type == 'contact'}">
						<div class="tzwidget-contact">
                            <address>
                                ${SiteSettings.getIt("地址") }
                            </address>
                            <a href="tel:${SiteSettings.getIt("电话") }">${SiteSettings.getIt("电话") }</a>
                            <a href="mailto:${SiteSettings.getIt("邮箱") }">${SiteSettings.getIt("邮箱") }</a>
                            <span class="tzwidget-social">
                                <a href="#"><i class="fa fa-weixin"></i></a>
                                <a href="#"><i class="fa fa-weibo"></i></a>
                                <a href="#"><i class="fa fa-qq"></i></a>
                            </span>
                        </div>
						</g:elseif>
						<g:elseif test="${footer['module'+idx].type == 'recent-post'}">
						<ul class="tz-recent-post">
							<g:each in="${footer['module'+idx].getRecentArticles() }" var="article">
							<li>
                                <g:photo photo="${article.titlePhoto }"/>
                                <div class="tz-recent-content">
                                	<g:link controller="blog" action="show" id="${article.id }">${article.title }</g:link>
                                    <span>
                                        ${article.dateCreated }
                                    </span>
                                </div>
                            </li>
							</g:each>
                        </ul>
						</g:elseif>
						<g:elseif test="${footer['module'+idx].type == 'recent-portfolio'}">
						<ul class="tz-recent-porjects">
							<g:each in="${footer['module'+idx].getRecentPortfolio() }" var="work">
	                        <li>
	                        	<g:link controller="${work.category }" action="show" id="${work.name }">
	                        		<g:photo photo="${work.titlePhoto }" alt="${work.title }"/>
	                        	</g:link>
	                        </li>
	                        </g:each>
                        </ul>
						</g:elseif>
						<g:elseif test="${footer['module'+idx].type == 'recent-project'}">
						<ul class="tz-recent-porjects">
							<g:each in="${footer['module'+idx].getRecentProjects() }" var="work">
	                        <li>
	                        	<g:link controller="${work.category }" action="show" id="${work.name }">
	                        		<g:photo photo="${work.titlePhoto }" alt="${work.title }"/>
	                        	</g:link>
	                        </li>
	                        </g:each>
                        </ul>
						</g:elseif>
						<g:elseif test="${footer['module'+idx].type == 'recent-work'}">
						<ul class="tz-recent-porjects">
							<g:each in="${footer['module'+idx].getRecentWorks() }" var="work">
	                        <li>
	                        	<g:link controller="${work.category }" action="show" id="${work.name }">
	                        		<g:photo photo="${work.titlePhoto }" alt="${work.title }"/>
	                        	</g:link>
	                        </li>
	                        </g:each>
                        </ul>
						</g:elseif>
                    </div>
                	</g:each>
                </div>
            </div>
        </div>
        <div class="tz-copyright theme-white">
            <p><g:copyRight/> All Rights Reserved.</p>
        </div>
    </footer><!--end class tz-footer-->