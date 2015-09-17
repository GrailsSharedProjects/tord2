/*
 * Method reize
 */
jQuery(window).bind('load resize', function() {
	if (typeof Desktop == "undefined") {
		try {
			console.log('Attention: Desktop is undefined, please set default values before using portfolio.js')
		}
		catch (e) {}
	}
	else {
		var $container = jQuery('.tzportfolio-pages');
		$container.imagesLoaded(function() {
			if (resizeTimer) clearTimeout(resizeTimer);
			resizeTimer = setTimeout("tz_init(Desktop, tabletportrait, mobilelandscape, mobileportrait)", 100);
		});
	}
});

/*
 * Initiate Portfolio
 */
jQuery(document).ready(function(){
    if (typeof Desktop == "undefined") {
		try {
			console.log('Attention: Desktop is undefined, please set default values before using portfolio.js')
		}
		catch (e) {}
	}
	else {
        loadPortfolio();
	}
});

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
        var img_url = jQuery(this).find('img').attr('data-original');
        if(img_url == undefined || img_url == ""){
        	img_url = jQuery(this).find('img').attr('src');
        }
        var image = new Image();
        image.src = img_url;
        widthImage = image.naturalWidth;
        heightImage = image.naturalHeight;
        var tzimg	=	new resizeImage(widthImage, heightImage, widthStage, heightStage);
        jQuery(this).find('img').css ({ top: tzimg.top, left: tzimg.left, width: tzimg.width, height: tzimg.height });
    });
}

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


/**
 * ------------------------------------------------------------------------
 * resizeImage Plugin
 * ------------------------------------------------------------------------
 * Copyright (C) 2012-2013 SUNLAND Co., JSC. All Rights Reserved.
 * license - GNU/GPL, http://www.gnu.org/licenses/gpl.html
 * Author: Sonle
 * Email: sonlv@templaza.com
 * Websites: http://www.templaza.com
 * ------------------------------------------------------------------------
 */
var resizeImage = function (widthImage, heightImage, widthStage, heightStage) {
    var escImageX = widthStage / widthImage;
    var escImageY = heightStage / heightImage;

    var escalaImage = (escImageX > escImageY) ? escImageX : escImageY;

    var widthV = widthImage * escalaImage;
    var heightV = heightImage * escalaImage;
    var posImageY = 0;
    var posImageX = 0;

    if (heightV > heightStage) {
        posImageY = (heightStage - heightV) / 2;
    };

    if (widthV > widthStage) {
        posImageX = (widthStage - widthV) / 2;
    };

    return { top: posImageY, left: posImageX, width: widthV, height: heightV };
};
