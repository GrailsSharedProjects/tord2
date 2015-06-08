//= require jquery.flexslider.js
//= require_self

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