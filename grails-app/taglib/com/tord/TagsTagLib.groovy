package com.tord

import com.tord.admin.Menu
import com.tord.admin.MenuStyle
import com.tord.admin.SiteSettings

class TagsTagLib {
//    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
	

	def bootstrap

	/**
	 * Apply Layouts
	 *
	 * @attr  pageData
	 *
	 */
	def layout = { attrs, body ->
		
		def pageData = attrs.remove('pageData');
		
		if(!pageData) {
			bootstrap.init();
			out<< """
				<script>\$(document).ready(function(){window.location.href=window.location.href});</script>
			"""
		}
		
		out << """
			<meta name="layout" content="${pageData.layoutName}"/>
		"""
	}
	
	def renderLogo = { attrs, body ->
		out << """
		<a href="${createLink(controller: 'home')}">
			<img src="${assetPath(src: 'tord_small.png')}" alt="LOGO">
		</a>
		"""
	}
	
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
			out << "<a href='${createLink(controller: sub.controller, action: sub.action, url: sub.url)}'>"
			out << (sub.icon)?"<span><i class='fa ${sub.icon}'></i></span> ":""
			out << "${sub.title }</a>"
			if(sub.subMenus){
				renderListRecursively(sub.subMenus);
			}
			out << '</li>'
		}
		out << '</ul>'
	}
	
	def copyRight = { attrs, body ->
		def str = SiteSettings.getIt("CopyRight");
		out << str
	}

	/*
	 * @attr bean
	 * @attr field
	 * 
	 */
	def fieldErrors = { attrs ->
		def bean = attrs.remove('bean')
		if (bean) {
			out << eachError(attrs, {
				out << "<span class='s2ui_error'>${message(error:it)}</span>"
			})
		}
	}
	
	/*
	 * @attr photo
	 * @attr photoId
	 * @attr url
	 *
	 */
	def photo = {attrs ->
	def url = attrs.remove('url');
		def Photo photo = attrs.remove('photo')
		def id = attrs.remove('photoId');
		
		attrs.remove('src');
		
		if(url) {
			if(url.startsWith("/uploaded")) {
				out << "<img src='${url}' "
			}else {
				out << "<img src='${g.assetPath(src: url)}' "
			}
		}else {
			if(!photo) {
				photo = Photo.findById(id);
			}
			if(photo) {
				if(photo.isUserUploaded()) {
					out << "<img src='${photo.url}' "
				}else {
					out << "<img src='${g.assetPath(src: photo.url)}' "
				}
			}else {
				out << """<img src='${g.assetPath(src: "demos/100x100.png")}' """
			}
		}
		
		closeTag(attrs, out)
	}
	
	def closeTag(attrs, out) {
		attrs?.each {
			out << "${it.key}='${it.value}' "
		}
		out << "/>";
	}
}

