package com.tord
import org.grails.taggable.*

class Photo implements Taggable, Serializable{
	String url;
	String originalFileName;
	String description;
	
	static constraints = {
		url unique: true, widget: 'photo'
		originalFileName blank: true, nullable: true
		description blank: true, nullable: true
	}
	
	static mapping = {
	}
	
	@Override
	public String toString() {
		"${url}"
	}
	
	boolean isUserUploaded() {
		if(url) {
			return url.startsWith("/uploaded");
		}
		return false;
	}
	
	static Photo createPhoto(String url) {
		def photo = Photo.findByUrl(url);
		if(!photo) {
			def originalFileName = url;
			if(originalFileName.contains("/")) {
				originalFileName = originalFileName.substring(originalFileName.lastIndexOf("/") + 1);
			}
			photo = new Photo(originalFileName: originalFileName, url: url);
		}
		photo.save(flush: true);
	}
	
	static Photo createPhoto(String url, String originalFileName) {
		def photo = Photo.findByUrl(url);
		if(photo) {
			photo.originalFileName = originalFileName;
		}else {
			photo = new Photo(originalFileName: originalFileName, url: url);
		}
		photo.save(flush: true);
	}
}
