package com.tord.admin

import com.tord.TDomainOperations;

class SliderRevolution implements TDomainOperations{
	
	String name
	
	List<Slider> sliders
	static hasMany = [sliders:Slider]
	
    static constraints = {
		name unique: true
		sliders nullable: true
    }
	
	@Override
	public String toString() {
		name
	}
}
