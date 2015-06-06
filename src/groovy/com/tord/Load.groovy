package com.tord;

import java.util.concurrent.TimeoutException;

public class Load {
	
	public static void main(String[] args) {
		new File("F:/pic").mkdir();
		for(def i in 001..500) {
			try {
				println sprintf('%03d', i)
				def file = new File("F:/pic/${sprintf('%03d', i)}-01.jpg");
				if(!file.exists()) {
					def bytes = "http://img.qlftea.com:7861/cc001/${sprintf('%03d', i)}-01.jpg".toURL().getBytes();
					file.setBytes(bytes);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace()
			}
		}
		
		println '------'
		
		def firstFiles = new File("F:/pic").listFiles(new FileFilter() {
			boolean accept(File f) {
				f.getName().endsWith("-01.jpg");
			};
		});
		for(def f in firstFiles) {
			println f.getName();
			def folder = f.getName().substring(0, f.getName().lastIndexOf("-"));
			
			try {
				for(def i in 2..100) {
						println "${folder}-${sprintf('%02d', i)}"
						def file = new File("F:/pic/${folder}-${sprintf('%02d', i)}.jpg");
						if(!file.exists()) {
							def bytes = "http://img.qlftea.com:7861/cc001/${folder}-${sprintf('%02d', i)}.jpg".toURL().getBytes();
							file.setBytes(bytes);
						}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace()
			}catch(ConnectException e) {
				e.printStackTrace()
			}
		}
		
	}
}
