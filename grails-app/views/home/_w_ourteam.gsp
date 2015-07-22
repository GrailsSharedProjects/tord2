
        <div class="container">
            <h3 class="tz-title-bold-3">
            	我们的团队
            </h3>
            <ul class="tz-team-slider">
            <g:each in="${widgets }" var="widget">
            	<li>
                    <div class="tz-team-item">
                        <div class="tz-team-overlay">
                            <div class="tz-team-img">
                            	<g:photo photo="${widget.photo }" alt="${widget.title }"/>
                            	<g:photo class="img-hover" photo="${widget.photo }" alt="${widget.title }"/>
                                <div class="tz-team-overlay-bk"></div>
                            </div>
                        </div>
                        <div class="tz-team-ds">
                            <h6>${widget.title }</h6>
                            <span>${widget.content }</span>
                        </div>
                    </div>
                </li>
            </g:each>
            </ul>
        </div><!--end class container-->