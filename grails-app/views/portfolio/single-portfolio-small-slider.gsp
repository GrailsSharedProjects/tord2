<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="Lportfolio"/>
    <title>我们的案例</title>
</head>
<body>

    <section class="tzsingle-wrap">
        <h1 class="tz-title-bold-3">
            SINGLE PAGE - SMALL SLIDER
        </h1>
        <div class="tzpagenavi-single">
            <button class="tzpage-left">
                <i class="fa fa-angle-left"></i>
            </button>
            <button class="tzpage-right">
                <i class="fa fa-angle-right"></i>
            </button>
        </div><!--end class tzpagenavi-->
        <div class="single-slider-small">
            <div class="container">
                <button class="tz_slider_prev"><i class="fa fa-angle-left"></i></button>
                <button class="tz_slider_next"><i class="fa fa-angle-right"></i></button>
                <ul class="tz-slider-full">
                    <li>
                        <img src="${assetPath(src: 'demos/single-slider.jpg') }" alt="single page small slider">
                    </li>
                    <li>
                        <img src="${assetPath(src: 'demos/single-slider1.jpg') }" alt="single page small slider">
                    </li>
                    <li>
                        <img src="${assetPath(src: 'demos/single-slider.jpg') }" alt="single page small slider">
                    </li>
                </ul>
            </div>
        </div><!--end class single-slider-full-->
        <div class="p-single-content">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12 p-content-left">
                        <h3 class="p-title">PROJECT DESCRIPTION</h3>
                        <p>
                            Maecenas ultrices viverra ligula, vel lobortis ante pulvinar sed. Donec erat magna, aliquam vitae semper vitae, accumsan vel nisl. Vivamus pellentesque orci sit amet odio dictum eget commodo nulla consequat. Proin iaculis tristique nisl ut eleifend. Maecenas lacus purus, malesuada eu scelerisque ac, commodo sed orci. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur a tortor ut leo mattis cursus. Vestibulum laoreet interdum pellentesque. Suspendisse vitae cursus urna.
                        </p>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla velit metus, ornare vitae malesuada in, fermentum ac turpis. Vestibulum convallis pulvinar tellus eget ultricies. Sed sollicitudin, sem vitae elementum euismod, velit arcu mattis diam, in scelerisque purus lorem eget elit. Sed vitae nunc in metus semper hendrerit. Curabitur metus felis, interdum quis sodales at, aliquam eu eros. Proin ac lacus urna, vel pulvinar ante. Integer posuere, sapien ut iaculis molestie, justo quam ultrices orci, eu laoreet nisl libero vel
                        </p>
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