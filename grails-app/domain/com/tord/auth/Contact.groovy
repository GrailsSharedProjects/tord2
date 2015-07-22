package com.tord.auth

import com.tord.TDomainOperations;

class Contact implements TDomainOperations{
	String name
	String email
	String phone
	String landLine
	String address
	
	String qq
	String weibo
	String weixin
	String facebook
	String twitter
	
	static constraints = {
		name unique: true
		email blank: true, nullable: true
		phone blank: true, nullable: true
		landLine blank: true, nullable: true
		address blank: true, nullable: true
		qq blank: true, nullable: true
		weibo blank: true, nullable: true
		weixin blank: true, nullable: true
		facebook blank: true, nullable: true
		twitter blank: true, nullable: true
	}

	static mapping = {
	}

	@Override
	public String toString() {
		"${name}"
	}
}
