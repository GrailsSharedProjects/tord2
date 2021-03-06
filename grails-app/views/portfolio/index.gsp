<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="${pageData.layoutName}"/>
    <title>${pageData.title }</title>
</head>
<body>

    <section class="tzportfolio-wrap">
        <div class="container">
            <h3 class="tz-title-portfolio">
                ${pageData.title }
            </h3>
            <div data-option-key="filter" class="tzfilter">
                <a class="selected" data-option-value="*" href="#show-all">全部</a>
                <g:each in="${tagMap }" var="entry">
                	<a data-option-value=".${entry.value }" href="#">${entry.key }</a>
                </g:each>
            </div>
        </div>
        <div class="tzportfolio-pages">
        	<g:each in="${works }" var="work">
            <div class="element ${work.tags.collect{tag-> tagMap[tag]}.join(' ')}">
                <div class="tz-inner">
                    <div class="tz-image-item">
                        <img alt="${work.titlePhotoAlt }" src="${assetPath(src: work.titlePhoto.url) }">
                        <a href="${createLink(controller:'portfolio', action:'show', id:work.name)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                        <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                    </div>
                    <h6><a href="${createLink(controller:'portfolio', action:'show', id:work.name)}">${work.title }</a></h6>
                    <span>${work.tags.join(' ')?.toUpperCase() }</span>
                </div>
            </div>
            </g:each>
        </div><!--end class tzportfolio-pages-->
    </section><!--end class tzportfolio-wrap-->
    
    <script>
            var Desktop           =   5,
                tabletportrait    =   3,
                mobilelandscape   =   2,
                mobileportrait    =   1,
                resizeTimer       =   null;
    </script>
</body>
</html>