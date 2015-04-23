package com.tord

class Page implements TDomainOperations{
	String name
	String title
	String desc
	
	PageLayout layout
	
	Header header
	SliderRevolution sliderRevolution
	
    static constraints = {
		name blank:false
		title blank: false
		desc nullable: true
		sliderRevolution nullable: true
    }
}
