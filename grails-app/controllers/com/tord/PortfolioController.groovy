package com.tord

class PortfolioController {

    def index() { 
		return mansory();
	}
	
    def mansory() {
		
    	render view: "portfolio-mansory", model: [pfId:params.id];
	}
	
    def grid4() {
		
    	render view: "portfolio-grid-4", model: [pfId:params.id];
	}
	
    def grid3() {
		
    	render view: "portfolio-grid-3", model: [pfId:params.id];
	}
	
    def grid2() {
		
    	render view: "portfolio-grid-2", model: [pfId:params.id];
	}
	
	////////////SINGLE VIEWS//////////////
	
	def gallery() {
		render view: "single-portfolio-gallery", model: [pfId:params.id];
	}
	
	def video() {
		render view: "single-portfolio-video", model: [pfId:params.id];
	}
	
	def slider() {
		render view: "single-portfolio-full-width-slider", model: [pfId:params.id];
	}
	
	def "slider-small"() {
		render view: "single-portfolio-small-slider", model: [pfId:params.id];
	}
	
	def sidebar() {
		render view: "single-portfolio-floating-sidebar", model: [pfId:params.id];
	}
	
}
