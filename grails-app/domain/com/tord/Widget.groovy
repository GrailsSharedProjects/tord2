package com.tord

import com.tord.TDomainOperations;

class Widget implements TDomainOperations{
	String name
	String category
	String title
	
	Photo photo
	String contentHTML
	String refController
	String refAction
	String refText
	
	static constraints = {
		name unique: true
		category()
		title()
		photo blank: true, nullable: true, widget: 'imagebed'
		contentHTML blank: true, nullable: true, widget: 'textarea'
		refController blank: true, nullable: true
		refAction blank: true, nullable: true
		refText blank: true, nullable: true
	}
	
	static mapping = {
	}
	
	@Override
	public String toString() {
		"${name}"
	}
}
