package com.tord

class BlogController {

    def index() { 
		def pageData = Page.findByName("BLOG_PAGE");
		render view: 'list', model:[pageData: pageData]
	}
	
	def show() {
		def pageData = Page.findByName("BLOG_PAGE");
		render view: 'show', model:[pageData: pageData, articleType: params.id]
	}
}
