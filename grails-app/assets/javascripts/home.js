// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better 
// to create separate JavaScript files as needed.
//
//= require jquery.min.js
//= require bootstrap.js
//= require jquery.parallax-1.1.3.js
//= require owl.carousel.js
//= require resize.js
//= require off-canvas.js
//= require jquery.isotope.min.js
//= require custom-portfolio.js
//= require master.js
//= require jquery.themepunch.tools.min.js
//= require jquery.themepunch.revolution.min.js
//= require_self

jQuery.noConflict();

jQuery(document).ready(function() {
    jQuery('#rev_slider_2_1').show().revolution(
            {
                dottedOverlay:"none",
                delay:6000,
                startwidth:960,
                startheight:350,
                hideThumbs:200,

                thumbWidth:100,
                thumbHeight:50,
                thumbAmount:4,

                navigationType:"none",
                navigationArrows:"solo",
                navigationStyle:"round",

                touchenabled:"on",
                onHoverStop:"on",

                swipe_velocity: 0.7,
                swipe_min_touches: 1,
                swipe_max_touches: 1,
                drag_block_vertical: false,


                keyboardNavigation:"off",

                navigationHAlign:"center",
                navigationVAlign:"bottom",
                navigationHOffset:0,
                navigationVOffset:20,

                soloArrowLeftHalign:"left",
                soloArrowLeftValign:"center",
                soloArrowLeftHOffset:20,
                soloArrowLeftVOffset:0,

                soloArrowRightHalign:"right",
                soloArrowRightValign:"center",
                soloArrowRightHOffset:20,
                soloArrowRightVOffset:0,

                shadow:0,
                fullWidth:"off",
                fullScreen:"on",

                spinner:"spinner0",

                stopLoop:"off",
                stopAfterLoops:-1,
                stopAtSlide:-1,

                shuffle:"off",


                forceFullWidth:"off",
                fullScreenAlignForce:"off",
                minFullScreenHeight:"",
                hideTimerBar:"on",
                hideThumbsOnMobile:"off",
                hideNavDelayOnMobile:1500,
                hideBulletsOnMobile:"off",
                hideArrowsOnMobile:"off",
                hideThumbsUnderResolution:0,

                fullScreenOffsetContainer: "",
                fullScreenOffset: "",
                hideSliderAtLimit:0,
                hideCaptionAtLimit:0,
                hideAllCaptionAtLilmit:0,
                startWithSlide:0
            });
});	/*ready*/

var Desktop           =   4,
    tabletportrait    =   2,
    mobilelandscape   =   2,
    mobileportrait    =   1,
    resizeTimer       =   null;

jQuery(window).load(function(){
    jQuery('div.slotholder').prepend('<div class="bk-responsive-slide"></div>');
});