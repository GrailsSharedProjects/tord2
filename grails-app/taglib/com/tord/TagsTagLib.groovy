package com.tord

class TagsTagLib {
//    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
	
	/**
	 * Renders the sub-menus recursively
	 *
	 * @attr  menu
	 * 
	 */
	def renderMenu = { attrs, body ->
		def Menu menu = attrs.menu
		def List<Menu> subMenuList = menu.subMenus
		
		if(subMenuList){
			if(menu.style == MenuStyle.SINGLE) {
				
					out << '<div class="nav-child dropdown-menu mega-dropdown-menu">'
					out << '<div class="mega-dropdown-inner">'
					out << '<div class="row">'
					
					out << '<div data-width="12" class="col-md-12 mega-col-nav">'
					out << '<div class="mega-inner">'
					renderListRecursively(subMenuList);
					out << '</div>'
					out << '</div>'
					
					out << '</div>'
					out << '</div>'
					out << '</div>'
					
			}else if(menu.style == MenuStyle.FOUR_GROUPS) {
				out << """
					<div class="nav-child dropdown-menu mega-dropdown-menu mega-dropdown-center mega-menu-style3 width1170">
	                    <div class="mega-dropdown-inner">
	                        <div class="row">
				"""
				
				def gpIds = subMenuList.collect {sub-> sub.groupId}.unique()
				gpIds.eachWithIndex {gpId, i ->
					if(i <= 3) { // only four rows are allowed
						def column = subMenuList.grep{sub-> sub.groupId == gpId}
						out << """
								<div data-width="3" class="col-md-3 mega-col-nav">
	                                <div class="mega-inner">
						"""
						renderListRecursively(column);
						out << """
	                                </div>
	                            </div>
						"""
					}
				}
				
				out << """
							</div>
	                    </div>
	                </div>
				"""
			} 
		}
	}
	
	def renderListRecursively(subMenuList) {
		out << '<ul class="mega-nav level1">'
		subMenuList.each{sub->
			out << '<li>'
			out << "<a href='${createLink(controller: sub.controller, action: sub.action, url: sub.url)}'>${sub.title }</a>"
			if(sub.subMenus){
				renderListRecursively(sub.subMenus);
			}
			out << '</li>'
		}
		out << '</ul>'
	}
}
