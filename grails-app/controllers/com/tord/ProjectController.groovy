package com.tord

import com.tord.admin.Page

class ProjectController {
	
	def workService
	
    def index() { 
		def pageData = Page.findByName("PROJECT_PAGE");
    	def works = workService.findAllByCategory("project");
		render view: "index", model: [pageData: pageData, works: works];
	}
	
	def show() {
		println "ID: " + params.id
		def pageData = Page.findByName("SHOW_PROJECT_PAGE");
		def work = workService.findByNameAndCategory(params.id, "project");
		if(!work) {
			flash.message = "找不到你所请求的页面！"
			redirect action: "index"
			return
		}
		render view: "show", model: [work: work, pageData: pageData];
	}
	
}
