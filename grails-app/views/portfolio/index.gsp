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
                <a data-option-value=".chair" href="#">即将上市</a>
                <a data-option-value=".lounge" href="#">四月</a>
                <a data-option-value=".sofa" href="#">三月</a>
                <a data-option-value=".design" href="#">二月</a>
                <a data-option-value=".accessories" href="#">往期精品</a>
            </div>
        </div>
        <div class="tzportfolio-pages">
        	<g:each in="${works }" var="work">
            <div class="element ${work.tags.join(' ')?.toLowerCase() }">
                <div class="tz-inner">
                    <div class="tz-image-item">
                        <img alt="${work.titlePic.alt }" src="${assetPath(src: work.titlePic.url) }">
                        <a href="${createLink(controller:'portfolio', action:'show', id:work.name)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                        <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                    </div>
                    <h6><a href="${createLink(controller:'portfolio', action:'show', id:work.name)}">${work.title }</a></h6>
                    <span>${work.tags.join(' ')?.toUpperCase() }</span>
                </div>
            </div>
            </g:each>
            <div class="element lounge sofa">
                <div class="tz-inner">
                    <div class="tz-image-item">
                        <img alt="Curabitur gravida justo" src="${assetPath(src: 'demos/portfolio/product2.jpg') }">
                        <a href="${createLink(controller:'portfolio', action:'show', id:2)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                        <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                    </div>
                    <h6><a href="${createLink(controller:'portfolio', action:'show', id:2)}">Curabitur gravida justo</a></h6>
                    <span>ACCESSORIES</span>
                </div>
            </div>
            <div class="element sofa">
                <div class="tz-inner">
                    <div class="tz-image-item">
                        <img alt="Maecenas posuere est" src="${assetPath(src: 'demos/portfolio/product3.jpg') }">
                        <a href="${createLink(controller:'portfolio', action:'show', id:3)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                        <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                    </div>
                    <h6><a href="${createLink(controller:'portfolio', action:'show', id:3)}">Maecenas posuere est</a></h6>
                    <span>ACCESSORIES</span>
                </div>
            </div>
            <div class="element accessories">
                <div class="tz-inner">
                    <div class="tz-image-item">
                        <img alt="Curabitur dictum erat" src="${assetPath(src: 'demos/portfolio/product4.jpg') }">
                        <a href="${createLink(controller:'portfolio', action:'show', id:4)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                        <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                    </div>
                    <h6><a href="${createLink(controller:'portfolio', action:'show', id:4)}">Curabitur dictum erat</a></h6>
                    <span>ACCESSORIES</span>
                </div>
            </div>
            <div class="element accessories">
                <div class="tz-inner">
                    <div class="tz-image-item">
                        <img alt="Vestibulum nec ante" src="${assetPath(src: 'demos/portfolio/product5.jpg') }">
                        <a href="${createLink(controller:'portfolio', action:'show', id:5)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                        <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                    </div>
                    <h6><a href="${createLink(controller:'portfolio', action:'show', id:5)}">Vestibulum nec ante</a></h6>
                    <span>ACCESSORIES</span>
                </div>
            </div>
            <div class="element design">
                <div class="tz-inner">
                    <div class="tz-image-item">
                        <img alt="Phasellus mattis eros" src="${assetPath(src: 'demos/portfolio/product6.jpg') }">
                        <a href="${createLink(controller:'portfolio', action:'show', id:6)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                        <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                    </div>
                    <h6><a href="${createLink(controller:'portfolio', action:'show', id:6)}">Phasellus mattis eros</a></h6>
                    <span>ACCESSORIES</span>
                </div>
            </div>
            <div class="element accessories">
                <div class="tz-inner">
                    <div class="tz-image-item">
                        <img alt="Quisque vitae velit porta" src="${assetPath(src: 'demos/portfolio/product7.jpg') }">
                        <a href="${createLink(controller:'portfolio', action:'show', id:7)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                        <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                    </div>
                    <h6><a href="${createLink(controller:'portfolio', action:'show', id:7)}">Quisque vitae velit porta</a></h6>
                    <span>ACCESSORIES</span>
                </div>
            </div>
            <div class="element accessories">
                <div class="tz-inner">
                    <div class="tz-image-item">
                        <img alt="Sed feugiat efficitur eros" src="${assetPath(src: 'demos/portfolio/product8.jpg') }">
                        <a href="${createLink(controller:'portfolio', action:'show', id:8)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                        <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                    </div>
                    <h6><a href="${createLink(controller:'portfolio', action:'show', id:8)}">Sed feugiat efficitur eros</a></h6>
                    <span>ACCESSORIES</span>
                </div>
            </div>
            <div class="element accessories">
                <div class="tz-inner">
                    <div class="tz-image-item">
                        <img alt="Phasellus mattis eros" src="${assetPath(src: 'demos/portfolio/product9.jpg') }">
                        <a href="${createLink(controller:'portfolio', action:'show', id:9)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                        <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                    </div>
                    <h6><a href="${createLink(controller:'portfolio', action:'show', id:9)}">Phasellus mattis eros</a></h6>
                    <span>ACCESSORIES</span>
                </div>
            </div>
            <div class="element accessories">
                <div class="tz-inner">
                    <div class="tz-image-item">
                        <img alt="portfolio1" src="${assetPath(src: 'demos/portfolio/product10.jpg') }">
                        <a href="${createLink(controller:'portfolio', action:'show', id:10)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                        <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                    </div>
                    <h6><a href="${createLink(controller:'portfolio', action:'show', id:10)}">Harper & Blohm - Cheese Shop</a></h6>
                    <span>ACCESSORIES</span>
                </div>
            </div>
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