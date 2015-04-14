package com.tord

class SliderRevolution {
	
	String desc
	
	List sliders
	
	static hasMany = [sliders:Slider]
	
    static constraints = {
		desc nullable: true
		sliders nullable: true
    }
}
