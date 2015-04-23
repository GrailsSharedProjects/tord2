package com.tord;

public trait TDomainOperations {
	static void deleteAllRows() {
		def found = findAll();
		if(found && found.size > 0) {
			def obj = found.get(0);
			println "[${obj.class.name}] Delete All Rows: " + found
			found*.delete();
		}
	}
}

