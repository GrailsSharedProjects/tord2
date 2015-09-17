package com.tord
import com.tord.admin.Page

class InfoController {
	
	def afterInterceptor = [action: this.&applyPageData] 
	
	private applyPageData(model){
		model.pageData = Page.findByName("INFO_PAGE");
	}
	
    def about() {
		def info = Info.findByName("ABOUT_INFO");
		render view:"info", model:[info: info];
	}
	
	def policy() {
		def info = Info.findByName("POLICY_INFO");
		render view:"info", model:[info: info];
	}
}
