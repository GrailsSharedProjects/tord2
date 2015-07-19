<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="${pageData.layoutName}"/>
    <title>${pageData.title }</title>
</head>
<body>

    <section class="tzsingle-wrap">
        <h1 class="tz-title-bold-3">
            ${work?.title }
        </h1>
<%--        <div class="tzpagenavi-single">--%>
<%--            <button class="tzpage-left">--%>
<%--                <i class="fa fa-angle-left"></i>--%>
<%--            </button>--%>
<%--            <button class="tzpage-right">--%>
<%--                <i class="fa fa-angle-right"></i>--%>
<%--            </button>--%>
<%--        </div><!--end class tzpagenavi-->--%>
        <g:if test="${work?.galleryPhotoList }">
        <div class="single-gallery-full">
            <ul class="tz-gallery-full">
            	<g:each in="${work.galleryPhotoList }" var="pic">
                <li>
                    <img src="${assetPath(src: pic.url) }" alt="Gallery Photo">
                </li>
                </g:each>
            </ul>
        </div><!--end class single-slider-full-->
        </g:if>
        <div class="p-single-content">
            <div class="container">
                <div class="row">
                    <div id="contentHTML" class="col-lg-8 col-md-8 col-sm-12 col-xs-12 p-content-left">
${raw(work?.contentHTML)}
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12 p-content-right">
                        <h3 class="p-title">ABOUT</h3>
                        <span class="first-span">Client: The Poets – Wedding Filmographer</span>
                        <span>Date: March 24, 2014</span>
                        <ul>
                            <li>
                                <i class="fa fa-chevron-circle-down"></i> Branding
                            </li>
                            <li>
                                <i class="fa fa-chevron-circle-down"></i> Interaction Design
                            </li>
                            <li>
                                <i class="fa fa-chevron-circle-down"></i> Stationary
                            </li>
                        </ul>
                        <a href="#" class="p-share">
                            <span>SHARE</span>
                        </a>
                    </div>
                </div>
            </div><!--end class container-->
        </div><!--end class p-single-content-->
        
		<g:render template="section_related" />
		
    </section><!--end class tzsingle-wrap-->
    
</body>
</html>