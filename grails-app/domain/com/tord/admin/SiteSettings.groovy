package com.tord.admin

import com.tord.TDomainOperations
import com.wicky.common.Base64

class SiteSettings implements TDomainOperations {
	String key
	String value
	
	static mapping = {
		key column: 'data_key'
		value column: 'data_val', type: 'text'
	}
	
	static void putIt(String key, String value, boolean flush = true) {
		def found = SiteSettings.findByKey(key);
		if(found) {
			found.value = value //getAsString(value)
			found.save(flush: flush);
			return;
		}
		
		def setting = new SiteSettings();
		setting.key = key;
		setting.value = value //getAsString(value)
		setting.save(flush: flush, insert: true);
		
	}
	
	static String getIt(String key) {
		def found = SiteSettings.findByKey(key);
		if(!found)return "";
		return found.getValue() //getAsObject(found.getValue());
	}
	
	static constraints = {
	}
	
//	private static Object getAsObject(String value) {
//		try {
//			byte[] data = Base64.decode(value);
//			ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
//			Object o = ois.readObject();
//			ois.close();
//			return o;
//		} catch (Exception e) {
//		}
//		return null;
//	}
//
//	private static String getAsString(Object value) {
//			try {
//				ByteArrayOutputStream baos = new ByteArrayOutputStream();
//				ObjectOutputStream oos = new ObjectOutputStream(baos);
//				oos.writeObject(value);
//				oos.close();
//				return new String(Base64.encode(baos.toByteArray()));
//			} catch (Exception e) {
//			}
//		return "";
//	}
	
}
