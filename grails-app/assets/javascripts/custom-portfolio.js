/*
 * Method resize image
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
        image.onload = function() {
        }
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
    var contentWidth    = jQuery('.tz-portfolio-content').width();
    var numberItem      = 2;
    var newColWidth     = 0;
    var heightElement   = 280;
    var landscape       = 0;
    var portrait        = 0;
    var featureColWidth = 0;
    var widthWindwow = jQuery(window).width();
    if (widthWindwow >= 992) {
        numberItem =  Desktop;
    } else if (  widthWindwow >= 768) {
        numberItem =  tabletportrait ;
    } else if (  widthWindwow >= 480) {
        numberItem =  mobilelandscape ;
    } else if (widthWindwow < 480) {
        numberItem =  mobileportrait ;
    }
    newColWidth    =  Math.floor(contentWidth / numberItem);
    heightElement  =  jQuery('.element').height();
    landscape      =  newColWidth * 2;
    portrait       =  280 * 2;

    jQuery('.element').css({
        width: newColWidth + 'px'
    });
    jQuery('.tz_feature_item, .tz-landscape').width(landscape);
    jQuery('.tz-portrait').css('height',portrait+'px');
    var $container  = jQuery('.tz-portfolio-content') ;
    $container.imagesLoaded(function(){
        $container.isotope({
            masonry:{
                columnWidth: newColWidth
            }
        });

    });
    TzTemplateResizeImage(jQuery('.element'));

}

/*
 * Method reize
 */
jQuery(window).bind('load resize', function() {
    if (resizeTimer) clearTimeout(resizeTimer);
    resizeTimer = setTimeout("tz_init(Desktop, tabletportrait, mobilelandscape, mobileportrait)", 100);
});

/*
 * Method Filter
 */
function loadPortfolio(){

        var $container = jQuery('.tz-portfolio');
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

}
jQuery(document).ready(function() {
    loadPortfolio();

}) ;