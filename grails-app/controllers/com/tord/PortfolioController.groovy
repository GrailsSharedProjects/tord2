package com.tord

import com.tord.admin.Page

class PortfolioController {
	
	def workService

    def index() { 
		def pageData = Page.findByName("PORTFOLIO_PAGE");
		def works = workService.findAllByCategory("portfolio");
		
		def allTags = workService.findAllTagsByCategory("portfolio");
		def tagMap = [:]
		int i = 0;
		allTags.eachWithIndex{tagName, idx->
			tagMap[tagName] = "tag-"+i++;
		}
		
    	render view: "index", model: [pageData: pageData, works: works, tagMap: tagMap];
	}
	
	def show() {
		def pageData = Page.findByName("SHOW_PORTFOLIO_PAGE");
		def work = workService.findByNameAndCategory(params.id, "portfolio");
		if(!work) {
			flash.message = "找不到你所请求的页面！"
			redirect action: "index"
			return
		}
		render view: "show", model: [work: work, pageData: pageData];
	}
	
	/////////////////////////////////////////////
	
    def mansory() {
		def pageData = Page.findByName("SHOW_PORTFOLIO_PAGE");
    	render view: "portfolio-mansory", model: [pfId:params.id, pageData: pageData];
	}
	
    def grid4() {
		def pageData = Page.findByName("SHOW_PORTFOLIO_PAGE");
    	render view: "portfolio-grid-4", model: [pfId:params.id, pageData: pageData];
	}
	
    def grid3() {
		def pageData = Page.findByName("SHOW_PORTFOLIO_PAGE");
    	render view: "portfolio-grid-3", model: [pfId:params.id, pageData: pageData];
	}
	
    def grid2() {
		def pageData = Page.findByName("SHOW_PORTFOLIO_PAGE");
    	render view: "portfolio-grid-2", model: [pfId:params.id, pageData: pageData];
	}
	
	////////////SINGLE VIEWS//////////////
	
	def video() {
		def pageData = Page.findByName("SHOW_PORTFOLIO_PAGE");
		render view: "single-portfolio-video", model: [pfId:params.id, pageData: pageData];
	}
	
	def slider() {
		def pageData = Page.findByName("SHOW_PORTFOLIO_PAGE");
		render view: "single-portfolio-full-width-slider", model: [pfId:params.id, pageData: pageData];
	}
	
	def sidebar() {
		def pageData = Page.findByName("SHOW_PORTFOLIO_PAGE");
		render view: "single-portfolio-floating-sidebar", model: [pfId:params.id, pageData: pageData];
	}
	
}
