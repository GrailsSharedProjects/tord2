package com.tord

import com.tord.admin.Page;

class ShopController {
	def afterInterceptor = [action: this.&applyPageData] 
	
	private applyPageData(model){
		model.pageData = Page.findByName("SHOP_PAGE");
	}
	
    def index() { 
		render view: 'list'
	}
	
    def show() { 
    	render view: 'show'
    }
	
    def checkout() { 
    	render view: 'checkout'
    }
}
