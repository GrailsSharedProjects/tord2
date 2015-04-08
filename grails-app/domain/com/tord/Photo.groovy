package com.tord

class Photo {
	String url;
	String title;
	String desc;
	
	static hasMany = [tags: Tag]
	
    static constraints = {
		url blank: false
		title nullable: true
		desc nullable: true
    }
	
	static mapping = {
	}
	
	@Override
	public String toString() {
		"$title[$id]"
	}
}
