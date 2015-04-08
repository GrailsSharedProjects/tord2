package com.tord

class Tag {
	
	String name;
	String desc;
	
    static constraints = {
		name blank: false
		desc nullable: true
    }
	
	@Override
	public String toString() {
		name
	}
}
