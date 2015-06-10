package com.tord

import com.tord.TDomainOperations;

class WorkCategory implements TDomainOperations{
	String name

	static constraints = {
		name unique: true
	}

	static mapping = {
	}

	@Override
	public String toString() {
		"${name}"
	}
}
