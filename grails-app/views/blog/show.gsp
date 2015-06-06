<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="${pageData.layoutName}"/>
    <title>${pageData.title }</title>
</head>
<body>

    <section class="tzsingleblog-wrap">
        <div class="container">
            <h3 class="tz-title-bold-3">产品培训文章</h3>
			<g:if test="${articleType == 'audio' }">
            <div class="tzpost-audio">
                <iframe class="iframe-full-audio" src="http://w.soundcloud.com/player/?url=http://api.soundcloud.com/tracks/143332652&amp;show_artwork=true&amp;auto_play=false&amp;sharing=true&amp;buying=true&amp;download=true&amp;show_user=true&amp;show_playcount=true&amp;show_comments=true">
                </iframe>
            </div>
            </g:if>
            <g:if test="${articleType == 'image' }">
            <div class="tzpost-image">
                <img src="${assetPath(src: 'demos/blog1.jpg') }" alt="Standard post with photo">
            </div>
            </g:if>
            <g:if test="${articleType == 'video' }">
			<div class="tzpostsingle-video">
                <div class="tz-video">
                    <button class="tzautoplay"><i class="fa fa-play"></i></button>
                    <button class="tzpause"><i class="fa fa-pause"></i></button>
                    <div class="bg-video"></div>
                    <video class="videoID">
                   		<source type="video/mp4" src="${assetPath(src: 'video.mp4') }" />
                        <source type="video/mp4" src="${assetPath(src: 'video.ogv') }" />
                        <source type="video/mp4" src="${assetPath(src: 'video.webm') }" />
                    </video>
                </div>
            </div>
            </g:if>
            <div class="tzpost-content">
                <h1>Standard post with photo</h1>
                <p>
                    Maecenas ultrices viverra ligula, vel lobortis ante pulvinar sed. Donec erat magna, aliquam vitae semper vitae, accumsan vel nisl. Vivamus pellentesque orci sit amet odio dictum eget commodo nulla consequat. Proin iaculis tristique nisl ut eleifend. Maecenas lacus purus, malesuada eu scelerisque ac, commodo sed orci. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur a tortor ut leo mattis cursus. Vestibulum laoreet interdum pellentesque. Suspendisse vitae cursus urna. dolor sit amet, consectetur adipiscing elit. Nulla velit metus, ornare vitae malesuada in, fermentum ac turpis. Vestibulum convallis pulvinar tellus eget ultricies. Sed sollicitudin, sem vitae elementum euismod, velit arcu mattis diam, in scelerisque purus lorem eget elit. Sed vitae nunc in metus semper hendrerit. Curabitur metus felis, interdum quis sodales at, aliquam eu eros. Proin ac lacus urna, vel pulvinar ante. Integer posuere, sapien ut iaculis molestie, justo quam ultrices orci, eu laoreet nisl libero vel elit.
                </p>
                <p class="outstanding">
                    Maecenas ultrices viverra ligula, vel lobortis ante pulvinar sed. Don, aliquam vitae vitae, accumsan vel nisl. Vivamus pellentesque orci sit amet odio dictum eget commodo nulla consequat. Proin iaculis tristique nisl ut eleifend. Maecenas lacus purus, malesuada eu scelerisque ac, commodo sed orci. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur a tortor ut leo mattis cursus. Vestibulum laoreet interdum pellentesque. Suspendisse vitae cursus urna. dolor sit amet.
                </p>
                <p>
                    Maecenas ultrices viverra ligula, vel lobortis ante pulvinar sed. Donec erat magna, aliquam vitae semper vitae, accumsan vel nisl. Vivamus pellentesque orci sit amet odio dictum eget commodo nulla consequat. Proin iaculis tristique nisl ut eleifend. Maecenas lacus purus, malesuada eu scelerisque ac, commodo sed orci. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur a tortor ut leo mattis cursus. Vestibulum laoreet interdum pellentesque. Suspendisse vitae cursus urna. dolor sit amet, consectetur adipiscing elit. Nulla velit metus, ornare vitae malesuada in, fermentum ac turpis. Vestibulum convallis pulvinar tellus eget ultricies. Sed sollicitudin, sem vitae elementum euismod, velit arcu mattis diam, in scelerisque purus lorem eget elit. Sed vitae nunc in metus semper hendrerit. Curabitur metus felis, interdum quis sodales at, aliquam eu eros. Proin ac lacus urna, vel pulvinar ante. Integer posuere, sapien ut iaculis molestie, justo quam ultrices orci, eu laoreet nisl libero vel elit.
                </p>
                <div class="tzshare">
                    <a href="#">
                        <span>SHARE THIS</span>
                    </a>
                </div>
            </div>
            <div class="tzpost-author">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                        <img class="tzpost-avata" src="${assetPath(src: 'demos/team3.jpg') }" alt="avata">
                        <h6>JOHNNY IGGY</h6>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse viverra mauris eget tortor.</p>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                        <strong class="post-tags-title">TAGS:</strong>
                        <span class="post-tags">
                            <a href="#">Article,</a>
                            <a href="#">Feature,</a>
                            <a href="#">News</a>
                        </span>
                        <span class="post-count-comment"><i class="fa fa-comment"></i> 15 comments</span>
                        <span class="post-count-likes"><i class="fa fa-heart"></i> 39 likes</span>
                    </div>
                </div>
            </div>
            <div class="tzpost-pagenavi">
                <a href="#" class="tzpost-pagenavi-left">
                    Video Post <i class="fa fa-angle-left"></i>
                </a>
                <a href="#" class="tzpost-pagenavi-right">
                    <i class="fa fa-angle-right"></i>  Blockquote Post
                </a>
            </div>
            <div class="tzcomments-area">
                <h3 class="tz-title-comment">3 COMMENTS</h3>
                <ol class="comment-list">
                    <li>
                        <div class="comment-body">
                            <div class="comment-author">
                                <img src="${assetPath(src: 'demos/team3.jpg') }" alt="JOHNNY">
                            </div>
                            <div class="comment-content">
                                <strong>JOHNNY IGGY</strong>
                                <span class="comment-metadata">
                                    2 days ago
                                    <a href="#">REPLY</a>
                                </span>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse viverra mauris eget tortor.</p>
                            </div><!--comment-content -->
                        </div><!--comment-body -->
                        <ol class="children">
                            <li>
                                <div class="comment-body">
                                    <div class="comment-author">
                                        <img src="${assetPath(src: 'demos/team2.jpg') }" alt="LILY ESSE">
                                    </div>
                                    <div class="comment-content">
                                        <strong>LILY ESSE</strong>
                                        <span class="comment-metadata">
                                            2 days ago
                                            <a href="#">REPLY</a>
                                        </span>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse viverra mauris eget tortor.</p>
                                    </div><!--comment-content -->
                                </div><!-- .comment-body -->
                            </li>
                        </ol><!-- .children -->
                    </li>
                    <li>
                        <div class="comment-body">
                            <div class="comment-author">
                                <img src="${assetPath(src: 'demos/team1.jpg') }" alt="JEFF ALAN">
                            </div>
                            <div class="comment-content">
                                <strong>JEFF ALAN</strong>
                                <span class="comment-metadata">
                                    2 days ago
                                    <a href="#">REPLY</a>
                                </span>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse viverra mauris eget tortor.</p>
                            </div><!--comment-content -->
                        </div><!--comment-body -->
                    </li>
                </ol>

                <h3 class="tz-title-comment">LEAVE A COMMENT</h3>

                <div id="respond" class="comment-respond">
                    <p>Your email address will not be published. Required fields are marked *</p>
                    <form method="post" class="row" name="comments_form" id="comments_form">
                        <div class="col-lg-4 col-md-3 col-sm-6 col-xs-12">
                            <label>Name *</label>
                            <input type="text"  class="form-control" id="comments_form_name" name="comments_form_name">
                        </div>
                        <div class="col-lg-4 col-md-3 col-sm-6 col-xs-12">
                            <label>Email *</label>
                            <input type="text" class="form-control" id="comments_form_email" name="comments_form_email">
                        </div>
                        <div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
                            <label>Website</label>
                            <input type="text" class="form-control" id="comments_form_website" name="comments_form_website">
                        </div>
                        <div class="clearfix"></div>
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 tzcomment-textarea">
                            <label>Comment</label>
                            <textarea rows="5" id="comments_form_comments" name="comments_form_comments" class="form-control"></textarea>
                        </div>
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 tzsubmit">
                            <input type="submit"  id="comments_form_submit" value="POST COMMENT">
                        </div>
                    </form>
                </div>
            </div>

            <h3 class="tz-title-bold-3">BLOG</h3>

            <div class="row gird-margin">
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <article class="blog-gird-item blog-item">
                        <div class="pageblog-thumb">
                            <img src="${assetPath(src: 'demos/blog/blog1.jpg') }" alt="Nullam viverra enim">
                            <a href="#" class="tzblog-view"><i class="fa fa-search"></i></a>
                        </div>
                        <h4><a href="#">Nullam viverra enim </a></h4>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incidi...
                        </p>
                        <span class="tzblog-meta">
                            <em>Apr 18, 2014</em>
                            <a href="#"><i class="fa fa-heart-o"></i> 20</a>
                            <a href="#"><i class="fa fa-comments"></i> 15</a>
                        </span>
                    </article>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <article class="blog-gird-item blog-item">
                        <div class="pageblog-thumb">
                            <img src="${assetPath(src: 'demos/blog/blog2.jpg') }" alt="Morbi faucibus non">
                            <a href="#" class="tzblog-view"><i class="fa fa-search"></i></a>
                        </div>
                        <h4><a href="#">Morbi faucibus non</a></h4>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incidi...
                        </p>
                        <span class="tzblog-meta">
                            <em>Apr 18, 2014</em>
                            <a href="#"><i class="fa fa-heart-o"></i> 20</a>
                            <a href="#"><i class="fa fa-comments"></i> 15</a>
                        </span>
                    </article>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <article class="blog-gird-item blog-item">
                        <div class="pageblog-thumb">
                            <img src="${assetPath(src: 'demos/blog/blog3.jpg') }" alt="Duis vitae tellus at">
                            <a href="#" class="tzblog-view"><i class="fa fa-search"></i></a>
                        </div>
                        <h4><a href="#">Duis vitae tellus at</a></h4>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incidi...
                        </p>
                        <span class="tzblog-meta">
                            <em>Apr 18, 2014</em>
                            <a href="#"><i class="fa fa-heart-o"></i> 20</a>
                            <a href="#"><i class="fa fa-comments"></i> 15</a>
                        </span>
                    </article>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <article class="blog-gird-item blog-item">
                        <div class="pageblog-thumb">
                            <img src="${assetPath(src: 'demos/blog/blog4.jpg') }" alt="Cheese Shop">
                            <a href="#" class="tzblog-view"><i class="fa fa-search"></i></a>
                        </div>
                        <h4><a href="#">Cheese Shop</a></h4>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incidi...
                        </p>
                        <span class="tzblog-meta">
                            <em>Apr 18, 2014</em>
                            <a href="#"><i class="fa fa-heart-o"></i> 20</a>
                            <a href="#"><i class="fa fa-comments"></i> 15</a>
                        </span>
                    </article>
                </div>
            </div><!--end class row-->
        </div><!--end class container-->
    </section><!--end class tzblog-wrap-->
      
</body>
</html>