package com.tord.admin

import com.tord.Page;

class AdminController {
	
	def bootstrap
	
    def index() {
		def pageData = Page.findByName("ADMIN_PAGE");
		model: [pageData: pageData]
	}
	
	def refresh() {
		def id = params.id
		if(id == "site") {
			bootstrap.setupSiteSettings();
		}else if(id == 'page') {
			bootstrap.setupPagesAndSliders()
		}else if(id == 'meta'){
			bootstrap.setupMetaData();
		}
		render "Refreshing $id ...."
	}
}