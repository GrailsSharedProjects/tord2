<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="${pageData.layoutName}"/>
    <title>${pageData.title }</title>
</head>
<body>
    <div class="tzcategory-shop-wrap">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 tzshop-aside">
                    <aside class="widget_categories widget">
                        <h3 class="module-title title-widget"><span>Category</span></h3>
                        <ul>
                            <li>
                                <i class="fa fa-chevron-right"></i>
                                <a href="shop-Categories.html"> Living Room</a>
                            </li>
                            <li>
                                <i class="fa fa-chevron-down"></i>
                                <a href="shop-Categories.html"> Bedroom</a>
                                <ul class="children">
                                    <li>
                                        <i class="fa fa-chevron-circle-right"></i>
                                        <a href="shop-Categories.html">Wardrobes</a>
                                    </li>
                                    <li>
                                        <i class="fa fa-chevron-circle-right"></i>
                                        <a href="shop-Categories.html">Mirrors</a>
                                    </li>
                                    <li>
                                        <i class="fa fa-chevron-circle-right"></i>
                                        <a href="shop-Categories.html">Bedroom Sets</a>
                                    </li>
                                    <li>
                                        <i class="fa fa-chevron-circle-right"></i>
                                        <a href="shop-Categories.html">Bedside Tables</a>
                                    </li>
                                    <li>
                                        <i class="fa fa-chevron-circle-right"></i>
                                        <a href="shop-Categories.html">Chest of Drawers</a>
                                    </li>
                                    <li>
                                        <i class="fa fa-chevron-circle-right"></i>
                                        <a href="shop-Categories.html">Mattresses</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <i class="fa fa-chevron-right"></i>
                                <a href="shop-Categories.html">Dining & Kitchen</a>
                            </li>
                            <li>
                                <i class="fa fa-chevron-right"></i>
                                <a href="shop-Categories.html">Bathroom</a>
                            </li>
                            <li>
                                <i class="fa fa-chevron-right"></i>
                                <a href="shop-Categories.html">Workspaces</a>
                            </li>
                            <li>
                                <i class="fa fa-chevron-right"></i>
                                <a href="shop-Categories.html">Bar</a>
                            </li>
                        </ul>
                    </aside>
                    <aside class="widget_bestsellers">
                        <h3 class="module-title title-widget"><span>BESTSELLERS</span></h3>
                        <ul>
                            <li>
                                <div class="as_bestsellers_thumb">
                                    <img src="${assetPath(src: 'demos/aside_1.jpg') }" alt="Dress With Back Bow">
                                </div>
                                <div class="as_bestsellers_content">
                                    <a href="${createLink(controller:'shop', action:'show', id:'')}">Dress With Back Bow</a>
                                    <span>$59.99 <em>$59.99</em></span>
                                </div>
                            </li>
                            <li>
                                <div class="as_bestsellers_thumb">
                                    <img src="${assetPath(src: 'demos/aside_2.jpg') }" alt="Vintage Bikini">
                                </div>
                                <div class="as_bestsellers_content">
                                    <a href="${createLink(controller:'shop', action:'show', id:'')}">Vintage Bikini</a>
                                    <span>$59.99</span>
                                </div>
                            </li>
                            <li>
                                <div class="as_bestsellers_thumb">
                                    <img src="${assetPath(src: 'demos/aside_3.jpg') }" alt="Dress With Pastel Color">
                                </div>
                                <div class="as_bestsellers_content">
                                    <a href="${createLink(controller:'shop', action:'show', id:'')}">Dress With Pastel Color</a>
                                    <span>$59.99</span>
                                </div>
                            </li>
                            <li>
                                <div class="as_bestsellers_thumb">
                                    <img src="${assetPath(src: 'demos/aside_4.jpg') }" alt="Dress With Back Bow">
                                </div>
                                <div class="as_bestsellers_content">
                                    <a href="${createLink(controller:'shop', action:'show', id:'')}">Dress With Back Bow</a>
                                    <span>$59.99</span>
                                </div>
                            </li>
                            <li>
                                <div class="as_bestsellers_thumb">
                                    <img src="${assetPath(src: 'demos/aside_5.jpg') }" alt="Dress With Back Bow">
                                </div>
                                <div class="as_bestsellers_content">
                                    <a href="${createLink(controller:'shop', action:'show', id:'')}'shop', action:'show', id:'')}">Dress With Back Bow</a>
                                    <span>$59.99</span>
                                </div>
                            </li>
                        </ul>
                    </aside>
                </div>
                <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
                    <div class="tzshopcat-description">
                        <h1 class="tz-title-bold-3">CHAIRS</h1>
                        <img src="${assetPath(src: 'demos/category-img.jpg') }" alt="Chairs">
                        <p>
                            Vestibulum viverra pellentesque nisl non adipiscing. Sed vel auctor purus. Sed semper non dui id congue. Vivamus laoreet arcu scelerisque, consectetur orci ut, lacinia justo. Sed diam ipsum, aliquet et vulputate ut, semper ut mi. Fusce tempor ultrices massa, dapibus sagittis elit consectetur at. Praesent vitae arcu mauris.
                        </p>
                        <p>
                            Vestibulum dignissim risus ut diam interdum, eget porta neque semper. Praesent consequat ac lorem eget fermentum. Etiam at sem elit. Sed ultricies eu justo ac vulputate. Maecenas est leo, feugiat sed facilisis non, sodales eu neque. Donec tincidunt ullamcorper nisl id semper. Nulla consequat metus sit amet porttitor scelerisque. Maecenas viverra sodales urna, eu porttitor mauris aliquam non.
                        </p>
                    </div>
                    <div class="row">
                        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item">
                            <div class="laster-thumb">
                                <div class="shop-icon-data">
                                    <img src="${assetPath(src: 'demos/hots.png') }" alt="hosts">
                                </div>
                                <img src="${assetPath(src: 'demos/shop1.jpg') }" alt="Linen Shirt With Mao Color">
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
                            <h6><a href="${createLink(controller:'shop', action:'show', id:'')}">Linen Shirt With Mao Color</a></h6>
                            <small>$59.99 </small>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item">
                            <div class="laster-thumb">
                                <img src="${assetPath(src: 'demos/shop2.jpg') }" alt="Superdry Shirt With Wash">
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
                            <h6><a href="${createLink(controller:'shop', action:'show', id:'')}">Superdry Shirt With Wash</a></h6>
                            <small>$59.99 </small>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item">
                            <div class="laster-thumb">
                                <img src="${assetPath(src: 'demos/shop3.jpg') }" alt="Arvust Shirt In Washed Blue">
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
                            <h6><a href="${createLink(controller:'shop', action:'show', id:'')}">Arvust Shirt In Washed Blue</a></h6>
                            <small><em>$59.99</em>$59.99 </small>
                        </div>

                        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item">
                            <div class="laster-thumb">
                                <img src="${assetPath(src: 'demos/shop4.jpg') }" alt="Phasellus mattis eros">
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
                            <h6><a href="${createLink(controller:'shop', action:'show', id:'')}">Phasellus mattis eros</a></h6>
                            <small>$59.99 </small>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item">
                            <div class="laster-thumb">
                                <img src="${assetPath(src: 'demos/shop5.jpg') }" alt="Proin sit amet ultrices">
                                <div class="shop-icon-data">
                                    <img src="${assetPath(src: 'demos/new.png') }" alt="new">
                                    <img  src="${assetPath(src: 'demos/sale.png') }" alt="sale">
                                </div>
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
                            <h6><a href="${createLink(controller:'shop', action:'show', id:'')}">Proin sit amet ultrices</a></h6>
                            <small>$59.99 </small>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item">
                            <div class="laster-thumb">
                                <img src="${assetPath(src: 'demos/shop6.jpg') }" alt="Aenean magna lorem">
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
                            <h6><a href="${createLink(controller:'shop', action:'show', id:'')}">Aenean magna lorem</a></h6>
                            <small><em>$59.99</em>$59.99 </small>
                        </div>
                    </div>
                    <div class="tzpagenavi-shop">
                        <a class="active">1</a>
                        <a href="#">2</a>
                        <a href="#">3</a>
                    </div>
                </div>
            </div>
        </div>
    </div><!--end class tzblog-wrap-->

</body>
</html>