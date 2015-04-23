package com.tord
import org.grails.taggable.*

class Photo implements Taggable, Serializable{
	String url;
	String alt;
	
    static constraints = {
		url blank: false
		alt nullable: true
    }
	
	static mapping = {
	}
	
	@Override
	public String toString() {
		"$alt[$id]"
	}
}
