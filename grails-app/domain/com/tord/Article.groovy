package com.tord

import org.grails.taggable.Taggable

class Article implements TDomainOperations, Taggable{
	String name
	
	String title
	Photo titlePhoto
	
	String contentHTML
	
	Date dateCreated
	Date lastUpdated
	
    static constraints = {
		name unique: true
		title()
		titlePhoto nullable: true, blank: true 
		contentHTML widget: 'textarea'
    }
	
	static mapping = {
		contentHTML type: 'text'
	}
	
	@Override
	public String toString() {
		"${name}"
	}
}
