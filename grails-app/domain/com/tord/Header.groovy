package com.tord

class Header implements TDomainOperations{
	String name
	HeaderStyle style = HeaderStyle.LIGHT
	
	List<Menu> menu
	static hasMany = [menu: Menu]
	
    static constraints = {
    }
	
	Menu createMenu(String title, String url) {
		def newMenu = new Menu(title: title, url: url);
		this.addToMenu(newMenu);
		newMenu
	}
	
	Menu createMenu(String title, String controller, String action) {
		def newMenu = new Menu(title: title, controller: controller, action: action);
		this.addToMenu(newMenu);
		newMenu
	}
	
	Menu createMenu(String title, String url, MenuStyle style) {
		def newMenu = new Menu(parent: null, title: title, url: url, style: style);
		this.addToMenu(newMenu);
		newMenu
	}
	
	Menu createMenu(String title, String controller, String action, MenuStyle style) {
		def newMenu = new Menu(parent: null, title: title, controller: controller, action: action, style: style);
		this.addToMenu(newMenu);
		newMenu
	}
}
