package com.tord

class Page {
	String title
	String desc
	SliderRevolution sliderRevolution
	
    static constraints = {
		title blank: false
		desc nullable: true
		sliderRevolution nullable: true
    }
}
