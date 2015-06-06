<html>
<head>
	<meta name='layout' content='security'/>
	<title><g:message code="springSecurity.login.title"/></title>
</head>

<body>
<section class="tzpage-default">
		<h3 class="tz-title-bold-3">登陆</h3>
		<div></div>
		<div id='login' class="container">
            <div class="joom-login">
                <h4 class="joom-title">请输入账户信息</h4>
                <g:if test='${flash.message}'>
					<p class='login_message'>${flash.message}</p>
				</g:if>
                <div class="row">
                    <div class="col-lg-7 col-md-7 col-sm-12 col-xs-12">
                        <form class="form-horizontal" action='${postUrl}' method='POST' id='loginForm' autocomplete='off'>
                            <div class="row">
                                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                    <label>用户名：</label>
                                </div>
                                <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
                                    <input type='text' class='text_' name='j_username' id='username'/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                    <label>密码：</label>
                                </div>
                                <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
                                    <input type='password' class='text_' name='j_password' id='password'/>
                                </div>
                            </div>
                            <div class="row">
                            	<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12"></div>
                            	<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
                            		<input type='checkbox' class='chk' style="display: inline; width: 20px;" name='${rememberMeParameter}' id='remember_me' <g:if test='${hasCookie}'>checked='checked'</g:if>/>
									<label for='remember_me' style="display: inline;">记住我</label>
                            	</div>
                            </div>
                            <div class="controls">
                                <input class="btn btn-primary" style="width: 80px;" type='submit' id="submit" value='登陆'/>
                            </div>
                        </form>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12 col-lg-offset-1 col-md-offset-1 col-sm-offset-0 col-xs-offset-0">
                        <ul class="joom-form-meta">
                            <li><a href="#">忘记密码？</a></li>
                            <li><a href="#">忘记用户名？</a></li>
                            <li><a href="#">还没有注册账户？</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
<script type='text/javascript'>
	<!--
	(function() {
		document.forms['loginForm'].elements['j_username'].focus();
	})();
	// -->
</script>
</section>
</body>
</html>
