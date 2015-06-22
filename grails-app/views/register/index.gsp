<html>

<head>
	<meta name='layout' content='security'/>
	<title><g:message code='spring.security.ui.register.title'/></title>
</head>

<body>
    <section class="tzpage-default">
        <h3 class="tz-title-bold-3">注册账户</h3>
        <div class="container">
            <div class="joom-registration">
            	<g:if test='${flash.message}'>
					<p class='register_message'>${flash.message}</p>
				</g:if>
				<g:if test='${emailSent}'>
					<g:message code='spring.security.ui.register.sent'/>
				</g:if>
				<g:else>
				    <h4 class="joom-title">请输入账户信息</h4>
					<g:form class="form-horizontal" action='register' name='registerForm'>
	                    <div class="row">
	                            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
	                                <div class="row">
	                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
	                                        <label>用户名：*</label>
	                                    </div>
	                                    <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12">
	                                    	<g:textField name="username" value="${command.username}"/>
	                                    	<g:fieldErrors bean="${command }" field="username"/>
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
	                                        <label>真实姓名：*</label>
	                                    </div>
	                                    <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
	                                        <g:textField name="realname" value="${command.realname}"/>
	                                    	<g:fieldErrors bean="${command }" field="realname"/>
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
	                                        <label>手机：*</label>
	                                    </div>
	                                    <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12">
	                                        <g:textField name="phone" value="${command.phone}"/>
	                                    	<g:fieldErrors bean="${command }" field="phone"/>
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
	                                        <label>邮箱：*</label>
	                                    </div>
	                                    <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
	                                        <g:textField name="email" value="${command.email}"/>
	                                    	<g:fieldErrors bean="${command }" field="email"/>
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
	                                        <label>密码：</label>
	                                    </div>
	                                    <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12">
	                                        <g:passwordField name="password" value="${command.password}"/>
	                                    	<g:fieldErrors bean="${command }" field="password"/>
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
	                                        <label>确认密码：</label>
	                                    </div>
	                                    <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
	                                        <g:passwordField name="password2" value="${command.password2}"/>
	                                    	<g:fieldErrors bean="${command }" field="password2"/>
	                                    </div>
	                                </div>
	                                <p class="form-ds">I have read and agree to the Privacy Policy </p>
	                            </div><!--end class 6-->
	                            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
	                                <div class="row">
	                                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
	                                        <label>Upload Avatar</label>
	                                    </div>
	                                    <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
	                                        <input type="file" name="upload">
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
	                                        <label>URL Avatar:</label>
	                                    </div>
	                                    <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
	                                        <input type="text" value="" name="ulavatar">
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
	                                        <label>Twitter:</label>
	                                    </div>
	                                    <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
	                                        <input type="text" value="" name="twitter">
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
	                                        <label>Facebook:</label>
	                                    </div>
	                                    <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
	                                        <input type="text" value="" name="facebook">
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
	                                        <label>Google+:</label>
	                                    </div>
	                                    <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
	                                        <input type="text" value="" name="google">
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
	                                        <label>Description:</label>
	                                    </div>
	                                    <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
	                                        <input type="text" value="" name="description">
	                                    </div>
	                                </div>
	                                <div class="controls">
	                                    <button class="btn btn-primary" type="submit">注册</button>
	                                </div>
	                            </div><!--end class 6-->
	                    </div><!--end class row-->
	                </g:form>
				</g:else>
            </div><!--end class joom-->
        </div><!--end class container-->
    </section><!--end class page default-->

</body>
</html>
