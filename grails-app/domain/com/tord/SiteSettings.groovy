package com.tord

class SiteSettings implements TDomainOperations {

//	List<Page> pages
//	static hasMany = [pages: Page]
	
    static constraints = {
    }
	
	void putIt(String key, Object value, boolean flush = true) {
		SiteProperties.putIt(key, value, flush);
	}
	
	Object getIt(String key) {
		SiteProperties.getIt(key);
	}
	
}
