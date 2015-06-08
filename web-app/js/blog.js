

jQuery(document).ready(function(){

    /**
     *  Method For Slider Blog
     * -----------------------------------------------------------------------------
     */
    jQuery(".tzblog-slider-content").owlCarousel({
        items : 1,
        itemsDesktop : [1199,1],
        itemsDesktopSmall : [979,1],
        itemsTablet: [768, 1],
        itemsMobile: [479, 1],
        slideSpeed:500,
        paginationSpeed:800,
        rewindSpeed:1000,
        autoPlay:false,
        stopOnHover: false,
        singleItem:false,
        rewindNav:false,
        pagination:false,
        paginationNumbers:false,
        itemsScaleUp:false
    });
    // Custom Navigation Events
    jQuery(".tz_slider_prev").click(function(){
        jQuery(".tzblog-slider-content").trigger('owl.prev');
    }) ;
    jQuery(".tz_slider_next").click(function(){
        jQuery(".tzblog-slider-content").trigger('owl.next');
    }) ;

});