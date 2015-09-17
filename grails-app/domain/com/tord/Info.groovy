package com.tord

import com.tord.TDomainOperations;

class Info implements TDomainOperations{
	String name
	String title
	String contentHTML
	
	static constraints = {
		name unique: true
		title()
		contentHTML blank: true, nullable: true, widget: 'textarea'
	}

	static mapping = {
	}

	@Override
	public String toString() {
		"${name}"
	}
}
