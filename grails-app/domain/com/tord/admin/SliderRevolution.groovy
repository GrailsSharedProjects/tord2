package com.tord.admin

import com.tord.TDomainOperations;

class SliderRevolution implements TDomainOperations{
	
	String desc
	
	List<Slider> sliders
	static hasMany = [sliders:Slider]
	
    static constraints = {
		desc()
		sliders nullable: true
    }
	
	@Override
	public String toString() {
		desc
	}
}
