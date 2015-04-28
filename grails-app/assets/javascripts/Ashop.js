// This is a manifest file that'll be compiled into Aportfolio.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better 
// to create separate JavaScript files as needed.
//
//= require jquery.min.js
//= require bootstrap.js
//= require owl.carousel.js
//= require resize.js
//= require off-canvas.js
//= require jquery.isotope.min.js
//= require jquery.flexslider.js
//= require master.js
//= require_self

jQuery.noConflict();

// jQuery for flexslider------------------
jQuery(window).load(function() {
    // The slider being synced must be initialized first
    jQuery('#carousel').flexslider({
        animation: "slide",
        controlNav: false,
        animationLoop: false,
        slideshow: false,
        directionNav: false,
        autoHeight: true,
        itemWidth: 80,
        itemMargin: 80,
        asNavFor: '#slider'
    });

    jQuery('#slider').flexslider({
        animation: "slide",
        controlNav: false,
        animationLoop: false,
        directionNav: false,
        autoHeight: true,
        slideshow: false,
        sync: "#carousel"
    });

});