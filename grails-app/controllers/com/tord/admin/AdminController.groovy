package com.tord.admin

import com.tord.Work


class AdminController {
	def afterInterceptor = [action: this.&applyPageData] 
	
	private applyPageData(model){
		model.pageData = Page.findByName("ADMIN_PAGE");
	}
	
	def bootstrap
	
    def index() {
    	render view: "index", model:[list: ["全站公共变量", "页面和幻灯片", "菜单、页眉、页脚", "公告"]]
	}
	
	def refresh() {
		def id = params.id
		switch(id) {
			case "全站公共变量":
				bootstrap.setupSiteSettings();
			break;
			case "页面和幻灯片":
				bootstrap.setupPagesAndSliders()
			break;
			case "菜单、页眉、页脚":
				bootstrap.setupMetaData();
			break;
			case "公告":
				bootstrap.setupInfomation();
			break;
		}
		render "完成 $id 重置"
	}
	
	def reload(){
		org.codehaus.groovy.grails.scaffolding.view.ScaffoldingViewResolver.scaffoldedViews.clear();
		render "success"
	}
}