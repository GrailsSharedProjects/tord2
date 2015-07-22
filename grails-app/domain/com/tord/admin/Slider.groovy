package com.tord.admin

import com.tord.Photo;
import com.tord.TDomainOperations;

class Slider implements TDomainOperations{
	String name
	Integer style
	Photo bgImage
	String bgImageAlt
	String row1
	String row2
	String row3
	String row4
	String row5
	
    static constraints = {
		name unique: true
		style blank: false, nullable: false, inList:[1,2,3]
		bgImage blank: true, nullable: true, widget: 'imagebed'
		row1 blank: true, nullable: true
		row2 blank: true, nullable: true
		row3 blank: true, nullable: true
		row4 blank: true, nullable: true
		row5 blank: true, nullable: true
    }
	
	static mapping = {
		
	}
	
	@Override
	public String toString() {
		"$name[$style]"
	}
}
