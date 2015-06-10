package com.tord.admin

import com.tord.Photo;
import com.tord.TDomainOperations;

class Slider implements TDomainOperations{
	String name
	Integer style
	Photo bgImage
	String row1
	String row2
	String row3
	String row4
	String row5
	
    static constraints = {
		name unique: true
		style blank: false, inList:[1,2,3]
		bgImage nullable: true
		row1 nullable: true
		row2 nullable: true
		row3 nullable: true
		row4 nullable: true
		row5 nullable: true
    }
	
	static mapping = {
		
	}
	
	@Override
	public String toString() {
		"$name[$style]"
	}
}
