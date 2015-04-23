package com.tord;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

import com.wicky.common.Base64;

public class TEST {

	public static void main(String[] args) {
		
		System.out.println(EM1.ST.more()); 
		
//		new TEST().test();
	}
	
    void test() {
		String data = "rO0ABXNyAA5jb20udG9yZC5QaG90b4kTSW7pEPamAgAFTAADYWx0dAASTGphdmEvbGFuZy9TdHJpbmc7TAAGZXJyb3JzdAAnTG9yZy9zcHJpbmdmcmFtZXdvcmsvdmFsaWRhdGlvbi9FcnJvcnM7TAACaWR0ABBMamF2YS9sYW5nL0xvbmc7TAADdXJscQB+AAFMAAd2ZXJzaW9ucQB+AAN4cHQABGxvZ29zcgAiZ3JhaWxzLnZhbGlkYXRpb24uVmFsaWRhdGlvbkVycm9yc4SXYF6dIa/HAgAAeHIAOG9yZy5zcHJpbmdmcmFtZXdvcmsudmFsaWRhdGlvbi5CZWFuUHJvcGVydHlCaW5kaW5nUmVzdWx0QGPOMio7T4QCAANJABdhdXRvR3Jvd0NvbGxlY3Rpb25MaW1pdFoAE2F1dG9Hcm93TmVzdGVkUGF0aHNMAAZ0YXJnZXR0ABJMamF2YS9sYW5nL09iamVjdDt4cgA8b3JnLnNwcmluZ2ZyYW1ld29yay52YWxpZGF0aW9uLkFic3RyYWN0UHJvcGVydHlCaW5kaW5nUmVzdWx0EsuYG9nJogACAAFMABFjb252ZXJzaW9uU2VydmljZXQANExvcmcvc3ByaW5nZnJhbWV3b3JrL2NvcmUvY29udmVydC9Db252ZXJzaW9uU2VydmljZTt4cgA0b3JnLnNwcmluZ2ZyYW1ld29yay52YWxpZGF0aW9uLkFic3RyYWN0QmluZGluZ1Jlc3VsdHTFj9gnkt3VAgAETAAGZXJyb3JzdAAQTGphdmEvdXRpbC9MaXN0O0wAFG1lc3NhZ2VDb2Rlc1Jlc29sdmVydAA1TG9yZy9zcHJpbmdmcmFtZXdvcmsvdmFsaWRhdGlvbi9NZXNzYWdlQ29kZXNSZXNvbHZlcjtMAApvYmplY3ROYW1lcQB+AAFMABBzdXBwcmVzc2VkRmllbGRzdAAPTGphdmEvdXRpbC9TZXQ7eHIALW9yZy5zcHJpbmdmcmFtZXdvcmsudmFsaWRhdGlvbi5BYnN0cmFjdEVycm9yc1SRBqAR8g2UAgACTAAKbmVzdGVkUGF0aHEAfgABTAAPbmVzdGVkUGF0aFN0YWNrdAARTGphdmEvdXRpbC9TdGFjazt4cHQAAHNyAA9qYXZhLnV0aWwuU3RhY2sQ/irCuwmGHQIAAHhyABBqYXZhLnV0aWwuVmVjdG9y2Zd9W4A7rwEDAANJABFjYXBhY2l0eUluY3JlbWVudEkADGVsZW1lbnRDb3VudFsAC2VsZW1lbnREYXRhdAATW0xqYXZhL2xhbmcvT2JqZWN0O3hwAAAAAAAAAAB1cgATW0xqYXZhLmxhbmcuT2JqZWN0O5DOWJ8QcylsAgAAeHAAAAAKcHBwcHBwcHBwcHhzcgAUamF2YS51dGlsLkxpbmtlZExpc3QMKVNdSmCIIgMAAHhwdwQAAAAAeHNyADpvcmcuc3ByaW5nZnJhbWV3b3JrLnZhbGlkYXRpb24uRGVmYXVsdE1lc3NhZ2VDb2Rlc1Jlc29sdmVydFm44wDd2rkCAAJMAAlmb3JtYXR0ZXJ0ADVMb3JnL3NwcmluZ2ZyYW1ld29yay92YWxpZGF0aW9uL01lc3NhZ2VDb2RlRm9ybWF0dGVyO0wABnByZWZpeHEAfgABeHB+cgBBb3JnLnNwcmluZ2ZyYW1ld29yay52YWxpZGF0aW9uLkRlZmF1bHRNZXNzYWdlQ29kZXNSZXNvbHZlciRGb3JtYXQAAAAAAAAAABIAAHhyAA5qYXZhLmxhbmcuRW51bQAAAAAAAAAAEgAAeHB0ABFQUkVGSVhfRVJST1JfQ09ERXEAfgASdAAOY29tLnRvcmQuUGhvdG9zcgARamF2YS51dGlsLkhhc2hTZXS6RIWVlri3NAMAAHhwdwwAAAAQP0AAAAAAAAB4cH////8BcQB+AARwdAAIbG9nby5wbmdw";
		
		Object obj = getAsObject(data);
		System.out.println( obj.getClass()); 
    }
	
	static Object getAsObject(String value) {
		try {
			byte[] data = Base64.decode(value);
			System.out.println(data); 
			ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
			Object o = ois.readObject();
			ois.close();
			System.out.println(o); 
			return o;
		} catch (Exception e) {
		}
		return null;
	}
	
	private enum EM1{
		ST, SS;

		public String more() {
			switch (this) {
			case ST:
				return "TTTTTTTTTTT";
			case SS:
				return "SSSSSSSSSS";
			default:
				return "RRRRRRRRRRR";
			}
		}
	}
}
