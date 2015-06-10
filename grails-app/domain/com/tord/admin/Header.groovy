package com.tord.admin

import com.tord.TDomainOperations;

class Header implements TDomainOperations{
	String name
	HeaderStyle style = HeaderStyle.LIGHT
	
	List<Menu> menu
	static hasMany = [menu: Menu]
	
    static constraints = {
		name unique: true
		style()
    }
	
	@Override
	public String toString() {
		"${name} (${style})"
	}
	
	Menu createMenu(Map map) {
		def newMenu = new Menu(map);
		this.addToMenu(newMenu);
		newMenu
	}
	
	Menu createMenu(String name, String title, String url) {
		def newMenu = new Menu(name: name, title: title, url: url);
		this.addToMenu(newMenu);
		newMenu
	}
	
	Menu createMenu(String name, String title, String controller, String action) {
		def newMenu = new Menu(name: name, title: title, controller: controller, action: action);
		this.addToMenu(newMenu);
		newMenu
	}
	
	Menu createMenu(String name, String title, String url, MenuStyle style) {
		def newMenu = new Menu(parent: null, name: name, title: title, url: url, style: style);
		this.addToMenu(newMenu);
		newMenu
	}
	
	Menu createMenu(String name, String title, String controller, String action, MenuStyle style) {
		def newMenu = new Menu(parent: null, name: name, title: title, controller: controller, action: action, style: style);
		this.addToMenu(newMenu);
		newMenu
	}
}
