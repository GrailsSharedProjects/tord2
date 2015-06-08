package com.tord.admin

import com.tord.TDomainOperations;

class Menu implements Serializable, TDomainOperations{
	Header header
	Menu parent
	MenuStyle style = MenuStyle.SINGLE
	Integer groupId = 0
	
	String title
	String icon
	String url
	String controller
	String action
	
	List<Menu> subMenus
	static hasMany = [subMenus: Menu]
	static mappedBy = [subMenus: 'parent']
	
    static constraints = {
		title()
		groupId()
		parent nullable: true
		subMenus nullable: true
		style()
		icon nullable: true
		url nullable: true
		controller nullable: true
		action nullable: true
		header nullable: true
    }
	
	@Override
	public String toString() {
		title
	}
	
	Menu createSubMenu(String title, String url) {
		def newMenu = new Menu(title: title, url: url)
		this.addToSubMenus(newMenu);
		newMenu
	}
	
	Menu createSubMenu(String title, String url, MenuStyle style) {
		def newMenu = new Menu(title: title, url: url, style: style)
		this.addToSubMenus(newMenu);
		newMenu
	}
	
	Menu createSubMenu(String title, String url, Integer groupId) {
		def newMenu = new Menu(title: title, url: url, groupId: groupId)
		this.addToSubMenus(newMenu);
		newMenu
	}
	
	Menu createSubMenu(String title, String url, MenuStyle style, Integer groupId) {
		def newMenu = new Menu(title: title, url: url, style: style, groupId: groupId)
		this.addToSubMenus(newMenu);
		newMenu
	}
	
	Menu createSubMenu(String title, String controller, String action) {
		def newMenu = new Menu(title: title, controller: controller, action: action)
		this.addToSubMenus(newMenu);
		newMenu
	}
	
	Menu createSubMenu(String title, String controller, String action, MenuStyle style) {
		def newMenu = new Menu(title: title, controller: controller, action: action, style: style)
		this.addToSubMenus(newMenu);
		newMenu
	}
	
	Menu createSubMenu(String title, String controller, String action, Integer groupId) {
		def newMenu = new Menu(title: title, controller: controller, action: action, groupId: groupId)
		this.addToSubMenus(newMenu);
		newMenu
	}
	
	Menu createSubMenu(String title, String controller, String action, MenuStyle style, Integer groupId) {
		def newMenu = new Menu(title: title, controller: controller, action: action, style: style, groupId: groupId)
		this.addToSubMenus(newMenu);
		newMenu
	}
}
