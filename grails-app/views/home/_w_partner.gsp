        <div class="container">
            <ul class="partner-slider">
            <g:each in="${widgets }" var="widget" >
                <li>
                	<g:photo photo="${widget.photo }" alt="${widget.title }"/>
                </li>
			</g:each>
            </ul>
        </div><!--end class container-->
