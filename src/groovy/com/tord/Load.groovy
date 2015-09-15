package com.tord;

import java.util.concurrent.TimeoutException;

import com.google.javascript.jscomp.fuzzing.ContinueFuzzer;

public class Load {
	
//	static String url = "http://www.tuigirl8.com/tu";
	static String url = "http://img1.mm131.com/pic";
	
	public static void main(String[] args) {
		def folder = new File("F:/图站/pic4")
		folder.mkdir();
		for(def i in 1930..1999) {
			try {
				println sprintf('%03d', i)
				def file = new File(folder, "${sprintf('%d', i)}-01.jpg");
				if(!file.exists()) {
					def bytes = (url + "/${sprintf('%d', i)}/1.jpg").toURL().getBytes();
					file.setBytes(bytes);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace()
			}
		}
		
		println '------'
		
		def firstFiles = folder.listFiles(new FileFilter() {
			boolean accept(File f) {
				f.getName().endsWith("-01.jpg");
			};
		});
		for(def f in firstFiles) {
			println "FFFFF: "+f.getName();
			def final parent = f.getName().substring(0, f.getName().lastIndexOf("-"));
			
			println "folder: "+f.getName();
			
			new Thread() {
				void run() {
					try {
						boolean tryAgain = false;
						for(def i in 2..100) {
							println "${parent}-${sprintf('%02d', i)}"
							def file = new File(folder, "${parent}-${sprintf('%02d', i)}.jpg");
							if(!file.exists()) {
								try {
									def bytes = (url + "/${parent}/${sprintf('%d', i)}.jpg").toURL().getBytes();
									file.setBytes(bytes);
								} catch (FileNotFoundException e) {
									if(!tryAgain){
										println "FileNotFound! Try Next ..."
										tryAgain = true;
										continue;
									}else{
										println "No more .. exit";
										break;
									}
								}
							}
						}
					}catch(ConnectException e) {
						e.printStackTrace()
					}
					
				}
			}.start();
		}
		
	}
}
