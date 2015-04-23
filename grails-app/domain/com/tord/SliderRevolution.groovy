package com.tord

class SliderRevolution implements TDomainOperations{
	
	String desc
	
	List<Slider> sliders
	static hasMany = [sliders:Slider]
	
    static constraints = {
		desc nullable: true
		sliders nullable: true
    }
}
