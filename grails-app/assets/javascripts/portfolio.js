/*
 * Method reize image
 * @variables class
 */
function TzTemplateResizeImage(obj){
    var widthStage;
    var heightStage ;
    var widthImage;
    var heightImage;
    obj.each(function (i,el){
        heightStage = jQuery(this).height();

        widthStage = jQuery (this).width();

        var img_url = jQuery(this).find('img').attr('src');

        var image = new Image();
        image.src = img_url;

        widthImage = image.naturalWidth;
        heightImage = image.naturalHeight;
        var tzimg	=	new resizeImage(widthImage, heightImage, widthStage, heightStage);
        jQuery(this).find('img').css ({ top: tzimg.top, left: tzimg.left, width: tzimg.width, height: tzimg.height });
    });

}

/*
 * Method portfolio column
 * @variables Desktop
 * @variables tabletportrait
 * @variables mobilelandscape
 * @variables mobileportrait
 */
function tz_init(Desktop, tabletportrait, mobilelandscape, mobileportrait){
    var contentWidth    = jQuery('.tzportfolio-pages').width();
    var numberItem      = 2;
    var newColWidth     = 0;
    var featureColWidth = 0;
    var widthWindwow = jQuery(window).width();
    if (widthWindwow >= 1200) {
        numberItem = Desktop;
    } else if (  widthWindwow >= 768) {
        numberItem = tabletportrait ;
    } else if (  widthWindwow >= 480) {
        numberItem = mobilelandscape ;
    } else if (widthWindwow < 480) {
        numberItem = mobileportrait ;
    }

    newColWidth = Math.floor(contentWidth / numberItem);
    featureColWidth = newColWidth * 2;
    jQuery('.element').width(newColWidth);
    jQuery('.tz_feature_item').width(featureColWidth);
    var $container  = jQuery('.tzportfolio-pages') ;
    $container.imagesLoaded(function(){
        $container.isotope({
            masonry:{
                columnWidth: newColWidth
            }
        });

    });
    TzTemplateResizeImage(jQuery('.tz-image-item'));
}

/*
 * Method reize
 */
jQuery(window).bind('load resize', function() {
    var $container  = jQuery('.tzportfolio-pages') ;
    $container.imagesLoaded(function(){
        if (resizeTimer) clearTimeout(resizeTimer);
        resizeTimer = setTimeout("tz_init(Desktop, tabletportrait, mobilelandscape, mobileportrait)", 100);
    });
});

/*
 * Method filter portfolio
 */
function loadPortfolio(){
    var $container  = jQuery('.tzportfolio-pages') ;
    var $optionSets = jQuery('.tzfilter'),
        $optionLinks = $optionSets.find('a');
    $optionLinks.click(function(event){
        event.preventDefault();
        var $this = jQuery(this);
        // don't proceed if already selected
        if ( $this.hasClass('selected') ) {
            return false;
        }
        var $optionSet = $this.parents('.tzfilter');
        $optionSet.find('.selected').removeClass('selected');
        $this.addClass('selected');

        // make option object dynamically, i.e. { filter: '.my-filter-class' }
        var options = {},
            key = $optionSet.attr('data-option-key'),
            value = $this.attr('data-option-value');

        // parse 'false' as false boolean
        value = value === 'false' ? false : value;
        options[ key ] = value;

        if ( key === 'layoutMode' && typeof changeLayoutMode === 'function' ) {
            // changes in layout modes need extra logic
            changeLayoutMode( $this, options );
        } else {
            // otherwise, apply new options
            $container.isotope( options );
        }
        return false;
    });
    tz_init(Desktop, tabletportrait, mobilelandscape, mobileportrait);
}
jQuery(document).ready(function(){


    loadPortfolio();

});
