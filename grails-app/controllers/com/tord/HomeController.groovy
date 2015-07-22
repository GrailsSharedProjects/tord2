package com.tord

import com.tord.admin.Page;

import grails.plugin.springsecurity.annotation.Secured

/**
 * HomeController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class HomeController {
	
	@Secured(['permitAll'])
	def index() {
		def homePage = Page.findByName("HOME_PAGE");
		
		def aboutList = Widget.findAllByCategory("首页关于");
		
		model:[pageData:homePage]
	}
	
}
