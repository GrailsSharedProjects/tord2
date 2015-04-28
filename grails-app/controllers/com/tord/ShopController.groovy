package com.tord

class ShopController {

    def index() { 
		def pageData = Page.findByName("SHOP_PAGE");
		render view: 'list', model:[pageData: pageData]
	}
	
    def show() { 
    	def pageData = Page.findByName("SHOP_PAGE");
    	render view: 'show', model:[pageData: pageData]
    }
	
    def checkout() { 
    	def pageData = Page.findByName("SHOP_PAGE");
    	render view: 'checkout', model:[pageData: pageData]
    }
}
