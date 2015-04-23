package com.tord

class AdminController {
	
	def bootstrap
	
    def index() {
		
		def pageData = Page.findByName("ADMIN_PAGE");
		
		model: [pageData: pageData]
	}
	
	def refresh() {

		
//		bootstrap.setupSiteSettings();
		bootstrap.setupPagesAndSliders()
		
		render "Refreshing ...."
	}
}