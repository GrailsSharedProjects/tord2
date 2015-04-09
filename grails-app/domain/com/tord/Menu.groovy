package com.tord

class Menu {
	Menu parent
	String url
	String title
	
	MenuStyle style
	BigDecimal gridColumnId
	
	static hasMany = [children: Menu]
	static mappedBy = [children: 'parent']
	
    static constraints = {
    }
}
