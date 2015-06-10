package com.tord.admin

import com.tord.Article


class AdminController {
	
	def bootstrap
	
    def index() {
		def pageData = Page.findByName("ADMIN_PAGE");
		model: [pageData: pageData]
	}
	
	def refresh() {
		def id = params.id
		switch(id) {
			case "site":
			bootstrap.setupSiteSettings();
			break;
			case "page":
			bootstrap.setupPagesAndSliders()
			break;
			case "meta":
			bootstrap.setupMetaData();
			break;
		}
		render "Refreshing $id ...."
	}
}