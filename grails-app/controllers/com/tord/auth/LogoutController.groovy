package com.tord.auth

import grails.plugin.springsecurity.SpringSecurityUtils

import javax.servlet.http.HttpServletResponse

class LogoutController extends grails.plugin.springsecurity.LogoutController{
	/**
	 * Index action. Redirects to the Spring security logout uri.
	 */
	def index() {
		if (!request.post && SpringSecurityUtils.getSecurityConfig().logout.postOnly) {
			response.sendError HttpServletResponse.SC_METHOD_NOT_ALLOWED // 405
			return
		}

		// TODO put any pre-logout code here
		redirect uri: SpringSecurityUtils.securityConfig.logout.filterProcessesUrl // '/j_spring_security_logout'
	}
}
