        <h3 class="tz-title-bold-4 tz-background3">
            <span>装修案例</span>
        </h3>
        <div class="tz-portfolio-content">
        	<g:each in="${workList }" var="work" status="idx">
        	
        	<figure class="element 
        	<g:if test="${idx == 0 }">tz-landscape</g:if>
        	<g:if test="${idx == 2 || idx == 3 }">tz-portrait</g:if>
        	">
                <g:photo photo="${work.titlePhoto }" alt="${work.titlePhotoAlt }"/>
                <figcaption>
                    <h6><a href="${createLink(controller:work.category.name, action:'show', id:work.name)}">${work.title }</a></h6>
<%--                    <a class="tz-cat" href="single-portfolio-gallery.html">Accessories</a>--%>
					<span class="tz-cat">${work.tags.join(' ')?.toUpperCase() }</span>
                </figcaption>
            </figure>
        	</g:each>
        </div><!--end class tz-portfolio-content-->