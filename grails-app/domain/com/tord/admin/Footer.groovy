package com.tord.admin

import com.tord.TDomainOperations;

class Footer implements TDomainOperations{
	String name
	
    static constraints = {
		name unique: true
    }
}
