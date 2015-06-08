package com.tord.admin

import com.tord.TDomainOperations;
import com.wicky.common.Base64

class SiteProperties implements TDomainOperations {
	
	String key
	String value
	
	static mapping = {
		value type: 'text'
	}
	
	static void putIt(String key, Object value, boolean flush = true) {
		def found = SiteProperties.findByKey(key);
		if(found) {
			found.value = getAsString(value)
			found.save(flush: flush);
			return;
		}
		
		def setting = new SiteProperties();
		setting.key = key;
		setting.value = getAsString(value)
		setting.save(flush: flush, insert: true);
		
	}
	
	static Object getIt(String key) {
		def found = SiteProperties.findByKey(key);
		if(!found)return "";
		return getAsObject(found.getValue());
	}
	
    static constraints = {
    }
	
	private static Object getAsObject(String value) {
		try {
			byte[] data = Base64.decode(value);
			ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
			Object o = ois.readObject();
			ois.close();
			return o;
		} catch (Exception e) {
		}
		return null;
	}

	private static String getAsString(Object value) {
			try {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				oos.writeObject(value);
				oos.close();
				return new String(Base64.encode(baos.toByteArray()));
			} catch (Exception e) {
			}
		return "";
	}
	
}
