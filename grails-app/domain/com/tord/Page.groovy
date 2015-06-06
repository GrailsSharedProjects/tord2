package com.tord

class Page implements TDomainOperations{
	String name
	String title
	String desc
	
	String layoutName
	Header header
	SliderRevolution sliderRevolution
	
	String customCss
	String customJavaScript
	
    static constraints = {
		name blank:false
		title blank: false
		desc nullable: true
		sliderRevolution nullable: true
		layoutName blank: false, nullable: true, inist: ['site', 'admin', 'security', 'uploader']
		header blank: false, nullable: true
		customCss blank: false, nullable: true
		customJavaScript blank: false, nullable: true
    }
}
