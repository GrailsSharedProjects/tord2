package com.tord
import org.grails.taggable.*

class Photo implements Taggable, Serializable{
	String alt;
	String url;
	
    static constraints = {
    	alt()
		url()
    }
	
	static mapping = {
	}
	
	@Override
	public String toString() {
		"$alt"
	}
}
