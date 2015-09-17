package com.tord

import com.tord.admin.Page;

import grails.plugin.springsecurity.annotation.Secured

/**
 * HomeController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class HomeController {
	
	def afterInterceptor = [action: this.&applyPageData] 
	
	private applyPageData(model){
		model.pageData = Page.findByName("HOME_PAGE");
	}
	
	@Secured(['permitAll'])
	def index() {
	}
	
}
