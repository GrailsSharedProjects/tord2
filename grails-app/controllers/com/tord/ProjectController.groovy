package com.tord

import com.tord.admin.Page;

class ProjectController {

    def index() { 
		def pageData = Page.findByName("PROJECT_PAGE");
    	render view: "index", model: [pfId:params.id, pageData: pageData];
	}
	
	def show() {
		def pageData = Page.findByName("SHOW_PROJECT_PAGE");
		render view: "show", model: [pfId:params.id, pageData: pageData];
	}
}
