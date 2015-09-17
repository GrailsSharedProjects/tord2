<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="${pageData.layoutName}"/>
    <title>${pageData.title }</title>
</head>
<body>

    <section class="tzblog-wrap">
        <div class="container">
            <h1 class="tz-title-bold-3">${pageData.title }</h1>
            <article class="blog-item blog-item-first">
                <div class="tzblog-slider">
                    <button class="tz_slider_prev"><i class="fa fa-angle-left"></i></button>
                    <button class="tz_slider_next"><i class="fa fa-angle-right"></i></button>
                    <ul class="tzblog-slider-content">
                        <li>
                            <img src="${assetPath(src: 'demos/blog1.jpg') }" alt="Standard post with photo">
                        </li>
                        <li>
                            <img src="${assetPath(src: 'demos/blog1.jpg') }" alt="Standard post with photo">
                        </li>
                        <li>
                            <img src="${assetPath(src: 'demos/blog1.jpg') }" alt="Standard post with photo">
                        </li>
                    </ul>
                </div>
                <h4><a href="${createLink(controller: 'blog', action: 'show', id:'image') }">Standard post with photo</a></h4>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim ...
                </p>
                <span class="tzblog-meta">
                    <em>Apr 18, 2014</em>
                    <a href="#"><i class="fa fa-user"></i> Johnny</a>
                    <a href="#"><i class="fa fa-heart-o"></i> 20</a>
                    <a href="#"><i class="fa fa-comments"></i> 15</a>
                </span>
                <a href="${createLink(controller: 'blog', action: 'show', id:'image') }" class="tzblog-viewmore tz-view-style2">
                    <span>READ MORE</span>
                </a>
            </article>
            <article class="blog-item">
                <h4><a href="${createLink(controller: 'blog', action: 'show', id:'') }">Standard post with photo</a></h4>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim ...
                </p>
                <span class="tzblog-meta">
                    <em>Apr 18, 2014</em>
                    <a href="#"><i class="fa fa-user"></i> Johnny</a>
                    <a href="#"><i class="fa fa-heart-o"></i> 20</a>
                    <a href="#"><i class="fa fa-comments"></i> 15</a>
                </span>
                <a href="${createLink(controller: 'blog', action: 'show', id:'') }" class="tzblog-viewmore tz-view-style2">
                    <span>READ MORE</span>
                </a>
            </article>
			
<%--			<g:render template="list_audio" />--%>
			
            <article class="blog-item">
                <div class="blog-video">
                    <div class="tz-video">
                        <button class="tzautoplay"><i class="fa fa-play"></i></button>
                        <button class="tzpause"><i class="fa fa-pause"></i></button>
                        <div class="bg-video"></div>
                        <video class="videoID">
                            <source type="video/mp4" src="/video/video.mp4" />
                            <source type="video/mp4" src="/video/video.ogv" />
                            <source type="video/mp4" src="/video/video.webm" />
                        </video>
                    </div>
                </div>
                <h4><a href="${createLink(controller: 'blog', action: 'show', id:'video') }">Video post</a></h4>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim ...
                </p>
                <span class="tzblog-meta">
                    <em>Apr 18, 2014</em>
                    <a href="#"><i class="fa fa-user"></i> Johnny</a>
                    <a href="#"><i class="fa fa-heart-o"></i> 20</a>
                    <a href="#"><i class="fa fa-comments"></i> 15</a>
                </span>
                <a href="${createLink(controller: 'blog', action: 'show', id:'video') }" class="tzblog-viewmore tz-view-style2">
                    <span>READ MORE</span>
                </a>
            </article>
            <article class="blog-item">
                <h4 class="tzquote-title"><a href="singlePost-quote.html">Quote post</a></h4>
                <div class="tzquote">
                    <p>
                        <i class="fa fa-quote-left"></i>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                        <i class="fa fa-quote-right"></i>
                    </p>
                    <strong>DEKOR THEMES – THEME DEVELOPMENT DEKOR</strong>
                </div>
                <span class="tzblog-meta">
                    <em>Apr 18, 2014</em>
                    <a href="#"><i class="fa fa-user"></i> Johnny</a>
                    <a href="#"><i class="fa fa-heart-o"></i> 20</a>
                    <a href="#"><i class="fa fa-comments"></i> 15</a>
                </span>
                <a href="${createLink(controller: 'blog', action: 'show', id:'quote') }" class="tzblog-viewmore tz-view-style2">
                    <span>READ MORE</span>
                </a>
            </article>

            <div class="tzpagenavi-blog">
                <a class="active">1</a>
                <a href="#">2</a>
                <a href="#">3</a>
            </div>
        </div><!--end class container-->
    </section><!--end class tzblog-wrap-->
    
</body>
</html>