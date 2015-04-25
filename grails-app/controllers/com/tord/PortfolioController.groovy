package com.tord

class PortfolioController {

    def index() { 
		return mansory();
	}
	
    def mansory() {
		def pageData = Page.findByName("PORTFOLIO_PAGE");
    	render view: "portfolio-mansory", model: [pfId:params.id, pageData: pageData];
	}
	
    def grid4() {
		def pageData = Page.findByName("PORTFOLIO_PAGE");
    	render view: "portfolio-grid-4", model: [pfId:params.id, pageData: pageData];
	}
	
    def grid3() {
		def pageData = Page.findByName("PORTFOLIO_PAGE");
    	render view: "portfolio-grid-3", model: [pfId:params.id, pageData: pageData];
	}
	
    def grid2() {
		def pageData = Page.findByName("PORTFOLIO_PAGE");
    	render view: "portfolio-grid-2", model: [pfId:params.id, pageData: pageData];
	}
	
	////////////SINGLE VIEWS//////////////
	
	def gallery() {
		def pageData = Page.findByName("PORTFOLIO_PAGE");
		render view: "single-portfolio-gallery", model: [pfId:params.id, pageData: pageData];
	}
	
	def video() {
		def pageData = Page.findByName("PORTFOLIO_PAGE");
		render view: "single-portfolio-video", model: [pfId:params.id, pageData: pageData];
	}
	
	def slider() {
		def pageData = Page.findByName("PORTFOLIO_PAGE");
		render view: "single-portfolio-full-width-slider", model: [pfId:params.id, pageData: pageData];
	}
	
	def "slider-small"() {
		def pageData = Page.findByName("PORTFOLIO_PAGE");
		render view: "single-portfolio-small-slider", model: [pfId:params.id, pageData: pageData];
	}
	
	def sidebar() {
		def pageData = Page.findByName("PORTFOLIO_PAGE");
		render view: "single-portfolio-floating-sidebar", model: [pfId:params.id, pageData: pageData];
	}
	
}
