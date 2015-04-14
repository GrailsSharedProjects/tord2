package com.tord

class Slider {
	Integer style
	String bgImgUrl
	String row1
	String row2
	String row3
	String row4
	String row5
	
    static constraints = {
		style blank: false
		bgImgUrl nullable: true
		row1 nullable: true
		row2 nullable: true
		row3 nullable: true
		row4 nullable: true
		row5 nullable: true
    }
	
	static mapping = {
		
	}
	
}
