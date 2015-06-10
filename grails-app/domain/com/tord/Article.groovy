package com.tord

import org.grails.taggable.Taggable

class Article implements TDomainOperations, Taggable{
	String name
	
    static constraints = {
		name unique: true
    }
}
