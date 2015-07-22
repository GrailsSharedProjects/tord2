package com.tord.admin

import com.tord.TDomainOperations;

class Footer implements TDomainOperations{
	String name
	
	FooterModule module1
	FooterModule module2
	FooterModule module3
	FooterModule module4
	
    static constraints = {
		name unique: true
		module1()
		module2()
		module3()
		module4()
    }
}
