package com.tord.admin

import com.tord.TDomainOperations;

class Page implements TDomainOperations{
	String name
	String title
	String description
	
	String layoutName = 'site'
	SliderRevolution sliderRevolution
	
	String customCss
	String customJavaScript
	
    static constraints = {
		name unique:true
		title blank: false
		description nullable: true
		sliderRevolution nullable: true
		layoutName blank: false, nullable: true, inList: ['home', 'site', 'admin', 'security'];
		customCss blank: false, nullable: true
		customJavaScript blank: false, nullable: true
    }
	
	@Override
	public String toString() {
		"$name ${description?"($description)":""}"
	}
}
