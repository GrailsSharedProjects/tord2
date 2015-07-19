package com.tord;


public class Images {
	
	public static void main(String[] args) {
		
		def folder = new File("F:/images");
		folder.each {file ->
			
			println file;
			
		}
	}
}
