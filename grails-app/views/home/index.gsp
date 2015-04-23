<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="L${pageData.layout.name}"/>
    <title>${pageData.title }</title>
</head>
<body>

	<g:render template="rev_slider" model="[rev:pageData.sliderRevolution]" />

    <section class="tz-about tz-about2 theme-white">
        <div class="container">
            <h3 class="tz-title-bold-3">
                	拓德一站式家装O2O平台
            </h3>
            <div class="row">
                <div class="col-lg-4 colg-md-4 col-sm-12 col-xs-12">
                    <div class="tz-about-item">
                        <i class="fa fa-flask color-darkturquoise"></i>
                        <div class="tz-about-bk">
                            <img src="${assetPath(src : 'demos/about-bk.jpg') }" alt="Professional">
                            <div class="tz-about-overlay">
                                <div class="tz-about-overlay-bk"></div>
                            </div>
                        </div>
                        <div class="tz-about-ds">
                            <h6>我们够专业</h6>
                            <p>老牌建材公司，积累了一流的人才、雄厚的资金和宽广的渠道，为您提供最专业的服务</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 colg-md-4 col-sm-12 col-xs-12">
                    <div class="tz-about-item">
                        <i class="fa fa-thumbs-up color-orange"></i>
                        <div class="tz-about-bk">
                            <img src="${assetPath(src : 'demos/about-bk.jpg') }" alt="Passionate">
                            <div class="tz-about-overlay">
                                <div class="tz-about-overlay-bk"></div>
                            </div>
                        </div>
                        <div class="tz-about-ds">
                            <h6>我们够专注</h6>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam ac tempus eros, non tempus massa. Vivamus ut nisl mauris. </p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 colg-md-4 col-sm-12 col-xs-12">
                    <div class="tz-about-item">
                        <i class="fa fa-thumb-tack color-darkorange"></i>
                        <div class="tz-about-bk">
                            <img src="${assetPath(src : 'demos/about-bk.jpg') }" alt="friendly">
                            <div class="tz-about-overlay">
                                <div class="tz-about-overlay-bk"></div>
                            </div>
                        </div>
                        <div class="tz-about-ds">
                            <h6>我们够专心</h6>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam ac tempus eros, non tempus massa. Vivamus ut nisl mauris. </p>
                        </div>
                    </div>
                </div>
            </div>
        </div><!--end class container-->
    </section><!--end class tz-about-->

    <section class="tz-portfolio">
        <h3 class="tz-title-bold-4 tz-background3">
            <span>装修案例</span>
        </h3>
        <div class="tz-portfolio-content">
            <figure class="element tz-landscape">
                <img src="${assetPath(src: 'demos/portfolio/p1.jpg') }" alt="Vivamus in lorem nisl">
                <figcaption>
                    <h6><a href="single-portfolio-gallery.html">Vivamus in lorem nisl.</a></h6>
                    <a class="tz-cat" href="single-portfolio-gallery.html">Accessories</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="${assetPath(src: 'demos/portfolio/p2.jpg') }" alt="Aenean risus nisi">
                <figcaption>
                    <h6><a href="single-portfolio-gallery.html">Aenean risus nisi</a></h6>
                    <a class="tz-cat" href="single-portfolio-gallery.html">Accessories</a>
                </figcaption>
            </figure>
            <figure class="element tz-portrait">
                <img src="${assetPath(src: 'demos/portfolio/p3.jpg') }" alt="Quisque porttitor enim">
                <figcaption>
                    <h6><a href="single-portfolio-gallery.html">Quisque porttitor enim</a></h6>
                    <a class="tz-cat" href="#">Accessories</a>
                </figcaption>
            </figure>
            <figure class="element tz-portrait">
                <img src="${assetPath(src: 'demos/portfolio/p4.jpg') }" alt="Aenean fermentum interdum">
                <figcaption>
                    <h6><a href="single-portfolio-gallery.html">Aenean fermentum interdum</a></h6>
                    <a class="tz-cat" href="single-portfolio-gallery.html">Accessories</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="${assetPath(src: 'demos/portfolio/p5.jpg') }" alt="Nam et aliquam eros">
                <figcaption>
                    <h6><a href="single-portfolio-gallery.html">Nam et aliquam eros</a></h6>
                    <a class="tz-cat" href="single-portfolio-gallery.html">Accessories</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="${assetPath(src: 'demos/portfolio/p6.jpg') }" alt="Praesent semper">
                <figcaption>
                    <h6><a href="single-portfolio-gallery.html">Praesent semper</a></h6>
                    <a class="tz-cat" href="single-portfolio-gallery.html">Accessories</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="${assetPath(src: 'demos/portfolio/p7.jpg') }" alt="Donec mauris ligula">
                <figcaption>
                    <h6><a href="single-portfolio-gallery.html">Donec mauris ligula</a></h6>
                    <a class="tz-cat" href="single-portfolio-gallery.html">Accessories</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="${assetPath(src: 'demos/portfolio/p2.jpg') }" alt="Ut non ex viverra">
                <figcaption>
                    <h6><a href="single-portfolio-gallery.html">Ut non ex viverra</a></h6>
                    <a class="tz-cat" href="single-portfolio-gallery.html">Accessories</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="${assetPath(src: 'demos/portfolio/p5.jpg') }" alt="Sed quis arcu luctus">
                <figcaption>
                    <h6><a href="single-portfolio-gallery.html">Sed quis arcu luctus</a></h6>
                    <a class="tz-cat" href="single-portfolio-gallery.html">Accessories</a>
                </figcaption>
            </figure>
        </div><!--end class tz-portfolio-content-->
    </section><!--end class tz-portfolio-->

    <section class="tz-our-team theme-white">
        <div class="container">
            <h3 class="tz-title-bold-3">
                MEET OUR TEAM
            </h3>
            <ul class="tz-team-slider">
                <li>
                    <div class="tz-team-item">
                        <div class="tz-team-overlay">
                            <div class="tz-team-img">
                                <img src="http://placehold.it/600x600" alt="Jordan Henrion">
                                <img class="img-hover" src="http://placehold.it/600x600" alt="Jordan Henrion">
                                <div class="tz-team-overlay-bk"></div>
                            </div>
                        </div>
                        <div class="tz-team-ds">
                            <h6>Jordan Henrion</h6>
                            <span>Founder</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="tz-team-item">
                        <div class="tz-team-overlay">
                            <div class="tz-team-img">
                                <img src="http://placehold.it/600x600" alt="Catherine Doe">
                                <img class="img-hover" src="http://placehold.it/600x600" alt="Catherine Doe">
                                <div class="tz-team-overlay-bk"></div>
                            </div>
                        </div>
                        <div class="tz-team-ds">
                            <h6>Catherine Doe</h6>
                            <span>CEO & Founder</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="tz-team-item">
                        <div class="tz-team-overlay">
                            <div class="tz-team-img">
                                <img src="http://placehold.it/600x600" alt="Marion Doe">
                                <img class="img-hover" src="http://placehold.it/600x600" alt="Marion Doe">
                                <div class="tz-team-overlay-bk"></div>
                            </div>
                        </div>
                        <div class="tz-team-ds">
                            <h6>Marion Doe</h6>
                            <span>Marketing</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="tz-team-item">
                        <div class="tz-team-overlay">
                            <div class="tz-team-img">
                                <img src="http://placehold.it/600x600" alt="Mary Jane Doe">
                                <img class="img-hover" src="http://placehold.it/600x600" alt="Mary Jane Doe">
                                <div class="tz-team-overlay-bk"></div>
                            </div>
                        </div>
                        <div class="tz-team-ds">
                            <h6>JMary Jane Doe</h6>
                            <span>Founder</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="tz-team-item">
                        <div class="tz-team-overlay">
                            <div class="tz-team-img">
                                <img src="http://placehold.it/600x600" alt="Jordan Henrion">
                                <img class="img-hover" src="http://placehold.it/600x600" alt="Jordan Henrion">
                                <div class="tz-team-overlay-bk"></div>
                            </div>
                        </div>
                        <div class="tz-team-ds">
                            <h6>Jordan Henrion</h6>
                            <span>Founder</span>
                        </div>
                    </div>
                </li>
            </ul>
        </div><!--end class container-->
    </section><!--end class tz-our-team-->

    <div class="parallax tz-simple">
        <button class="simple_prev"><i class="fa fa-angle-left"></i></button>
        <button class="simple_next"><i class="fa fa-angle-right "></i></button>
        <div class="container">
            <ul class="tz-simple-product">
                <li>
                    <p>AMAZING LIGHT BOX</p>
                    <a href="#">BUY ITEM</a>
                </li>
                <li>
                    <p>AMAZING LIGHT BOX</p>
                    <a href="#">BUY ITEM</a>
                </li>
                <li>
                    <p>AMAZING LIGHT BOX</p>
                    <a href="#">BUY ITEM</a>
                </li>
                <li>
                    <p>AMAZING LIGHT BOX</p>
                    <a href="#">BUY ITEM</a>
                </li>
            </ul>
        </div><!--end class container-->
    </div><!--end class parallax -->

    <section class="tz-free-shipping theme-orange">
        <div class="container">
            <div class="row">
                <div class="col-lg-8">
                    <span class="icon-shopping-cart">
                        <i class="fa fa-shopping-cart"></i>
                    </span>
                    <div class="tz-shipping-content">
                    <h6>FREE SHIPPING & RETURN</h6>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu dolor felis. Duis in tristique enim.</p>
                    </div>
                </div>
                <div class="col-lg-4">
                    <a href="#" class="learn-more pull-right">
                        <span>LEARN MORE</span>
                    </a>
                </div>
            </div><!--end class row-->
        </div><!--end class container-->
    </section><!--end class tz-free-shipping-->

    <section class="tz-lastest-shop theme-white shop-style2">
        <h3 class="tz-title-bold-3">
            LASTEST FROM SHOP
        </h3>
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 laster-shop-item">
                    <div class="laster-thumb">
                        <img src="http://placehold.it/270x270" alt="Linen Shirt With Mao Color">
                        <span class="tz-shop-meta">
                            <a href="#" class="tzshopping">
                                <i class="fa fa-shopping-cart"></i>
                            </a>
                            <a href="#" class="tzheart">
                                <i class="fa fa-heart"></i>
                            </a>
                            <a href="#" class="tztasks">
                                <i class="fa fa-tasks"></i>
                            </a>
                        </span>
                    </div>
                    <h6><a href="singlePost-image.html">Linen Shirt With Mao Color</a></h6>
                    <small>$59.99 </small>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 laster-shop-item">
                    <div class="laster-thumb">
                        <img src="http://placehold.it/270x270" alt="Superdry Shirt With Wash">
                        <span class="tz-shop-meta">
                            <a href="#" class="tzshopping">
                                <i class="fa fa-shopping-cart"></i>
                            </a>
                            <a href="#" class="tzheart">
                                <i class="fa fa-heart"></i>
                            </a>
                            <a href="#" class="tztasks">
                                <i class="fa fa-tasks"></i>
                            </a>
                        </span>
                    </div>
                    <h6><a href="singlePost-image.html">Superdry Shirt With Wash</a></h6>
                    <small>$59.99 </small>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 laster-shop-item">
                    <div class="laster-thumb">
                        <img src="http://placehold.it/270x270" alt="Arvust Shirt In Washed Blue">
                        <span class="tz-shop-meta">
                            <a href="#" class="tzshopping">
                                <i class="fa fa-shopping-cart"></i>
                            </a>
                            <a href="#" class="tzheart">
                                <i class="fa fa-heart"></i>
                            </a>
                            <a href="#" class="tztasks">
                                <i class="fa fa-tasks"></i>
                            </a>
                        </span>
                    </div>
                    <h6><a href="singlePost-image.html">Arvust Shirt In Washed Blue</a></h6>
                    <small><em>$59.99</em>$59.99 </small>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 laster-shop-item">
                    <div class="laster-thumb">
                        <img src="http://placehold.it/270x270" alt="Selected Premium Formal Shirt">
                        <span class="tz-shop-meta">
                            <a href="#" class="tzshopping">
                                <i class="fa fa-shopping-cart"></i>
                            </a>
                            <a href="#" class="tzheart">
                                <i class="fa fa-heart"></i>
                            </a>
                            <a href="#" class="tztasks">
                                <i class="fa fa-tasks"></i>
                            </a>
                        </span>
                    </div>
                    <h6><a href="singlePost-image.html">Selected Premium Formal Shirt</a></h6>
                    <small>$59.99 </small>
                </div>
            </div>
        </div><!--end class container-->
    </section><!--end class tz-lastest-shop-->

    <div class="tz-partner theme-gray">
        <div class="container">
            <ul class="partner-slider">
                <li>
                    <img src="http://placehold.it/160x100" alt="partler4">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler3">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler1">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler2">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler5">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler6">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler3">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler4">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler4">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler3">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler1">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler2">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler5">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler6">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler3">
                </li>
                <li>
                    <img src="http://placehold.it/160x100" alt="partler4">
                </li>
            </ul>
        </div><!--end class container-->
    </div><!--end class partner-->
    
</body>
</html>