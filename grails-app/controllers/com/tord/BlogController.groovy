package com.tord

import com.tord.admin.Page;

class BlogController {
	def afterInterceptor = [action: this.&applyPageData] 
	
	private applyPageData(model){
		model.pageData = Page.findByName("BLOG_PAGE");
	}
	
    def index() { 
		render view: 'list'
	}
	
	def show() {
		render view: 'show', model:[articleType: params.id]
	}
}
