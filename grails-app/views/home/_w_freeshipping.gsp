        <div class="container">
            <div class="row">
                <div class="col-lg-8">
                    <span class="icon-shopping-cart">
                        <i class="fa fa-shopping-cart"></i>
                    </span>
                    <div class="tz-shipping-content">
                    <h6>${widget.title }</h6>
                    <p>${widget.content }</p>
                    </div>
                </div>
                <div class="col-lg-4">
                    <g:link controller="${widget.refController }" 
                    action="${widget.refAction }"
                    class="learn-more pull-right">
                    	<span>${widget.refText }</span>
                    </g:link>
                </div>
            </div><!--end class row-->
        </div><!--end class container-->