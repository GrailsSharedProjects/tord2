package com.tord

import org.grails.taggable.Taggable

import com.tord.admin.Menu;
import com.tord.admin.MenuStyle;

class Work implements TDomainOperations, Taggable{
	String name
	WorkCategory category
	
	//Tag tag
	String title
	Photo titlePic 
	Product product
	String contentHTML
	
	List<Photo> picList
	static hasMany = [picList: Photo]
	
    static constraints = {
		name unique: true
		category()
		title()
		titlePic()
		product nullable: true
		picList nullable: true
		contentHTML(widget:'textarea')
    }
	
	static mapping = {
		contentHTML type: 'text'
	}
	
	@Override
	public String toString() {
		name
	}
	
	Photo addPhoto(String url, String alt) {
		def newPhoto = new Photo(url: url, alt: alt);
		this.addToPicList(newPhoto);
		newPhoto
	}
}
