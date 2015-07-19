package com.tord

import com.tord.TDomainOperations;

class Widget implements TDomainOperations{
	String name
	Photo photo
	String title
	String content
	String category
	
	static constraints = {
		name unique: true
		photo blank: true, nullable: true
		title()
		content()
		category()
	}
	
	static mapping = {
	}
	
	@Override
	public String toString() {
		"${name}"
	}
}
