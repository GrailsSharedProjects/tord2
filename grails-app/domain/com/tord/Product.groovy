package com.tord

import org.grails.taggable.Taggable

class Product implements TDomainOperations, Taggable{
	String name;

    static constraints = {
		name unique: true
    }
	
	static mapping = {
	}
	
	@Override
	public String toString() {
		"${name}"
	}
}
