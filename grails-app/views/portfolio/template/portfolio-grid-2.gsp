<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="Lportfolio"/>
    <title>我们的案例</title>
</head>
<body>

    <section class="tzportfolio-wrap">
        <div class="container">
            <h3 class="tz-title-portfolio">
                PORTFOLIO
            </h3>
            <div data-option-key="filter" class="tzfilter">
                <a class="selected" data-option-value="*" href="#show-all">All</a>
                <a data-option-value=".chair" href="#">CHAIR</a>
                <a data-option-value=".lounge" href="#">LOUNGE</a>
                <a data-option-value=".sofa" href="#">SOFA</a>
                <a data-option-value=".accessories" href="#">ACCESSORIES</a>
            </div>
            <div class="tzportfolio-pages tz-no-mansory tz-grid-2">
                <div class="element chair lounge">
                    <div class="tz-inner">
                        <div class="tz-image-item">
                            <img alt="Cheese Shop" src="http://placehold.it/570x523">
                            <a href="${createLink(controller:'portfolio', action:'gallery', id:1)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                            <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                        </div>
                        <h6><a href="${createLink(controller:'portfolio', action:'gallery', id:1)}">Harper & Blohm - Cheese Shop</a></h6>
                        <span>ACCESSORIES</span>
                    </div>
                </div>
                <div class="element lounge sofa">
                    <div class="tz-inner">
                        <div class="tz-image-item">
                            <img alt="Aenean consectetur Shop" src="http://placehold.it/570x523">
                            <a href="${createLink(controller:'portfolio', action:'gallery', id:1)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                            <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                        </div>
                        <h6><a href="${createLink(controller:'portfolio', action:'gallery', id:1)}">Aenean consectetur Shop</a></h6>
                        <span>ACCESSORIES</span>
                    </div>
                </div>
                <div class="element sofa">
                    <div class="tz-inner">
                        <div class="tz-image-item">
                            <img alt="Vivamus tristique sapien" src="http://placehold.it/570x523">
                            <a href="${createLink(controller:'portfolio', action:'gallery', id:1)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                            <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                        </div>
                        <h6><a href="${createLink(controller:'portfolio', action:'gallery', id:1)}">Vivamus tristique sapien</a></h6>
                        <span>ACCESSORIES</span>
                    </div>
                </div>
                <div class="element accessories">
                    <div class="tz-inner">
                        <div class="tz-image-item">
                            <img alt="Praesent bibendum consequat" src="http://placehold.it/570x523">
                            <a href="${createLink(controller:'portfolio', action:'gallery', id:1)}" class="tzfa-search"><i class="fa fa-search"></i></a>
                            <a href="#" class="tzfa-heart"><i class="fa fa-heart"></i></a>
                        </div>
                        <h6><a href="${createLink(controller:'portfolio', action:'gallery', id:1)}">Praesent bibendum consequat</a></h6>
                        <span>ACCESSORIES</span>
                    </div>
                </div>
            </div><!--end class tzportfolio-pages-->
            <div class="tzpagenavi">
                <button class="tzpage-left">
                    <i class="fa fa-angle-left"></i>
                </button>
                <button class="tzpage-right">
                    <i class="fa fa-angle-right"></i>
                </button>
            </div><!--end class tzpagenavi-->
        </div><!--end class container-->
    </section><!--end class tzportfolio-wrap-->

    <script>
            var Desktop           =   2,
                tabletportrait    =   2,
                mobilelandscape   =   2,
                mobileportrait    =   1,
                resizeTimer       =   null;
    </script>
</body>
</html>