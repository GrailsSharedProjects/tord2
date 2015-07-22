package com.tord

import org.grails.taggable.Taggable

import com.tord.admin.Menu;
import com.tord.admin.MenuStyle;

class Work implements TDomainOperations, Taggable{
	String name
	WorkCategory category
	Boolean showOnHomePage = false;
	
	//Tag tag
	String title
	Photo titlePhoto
	String titlePhotoAlt
	Product product
	String contentHTML
	
	List<Photo> galleryPhotoList
	static hasMany = [galleryPhotoList: Photo]
	
    static constraints = {
		name unique: true
		category()
		showOnHomePage()
		title()
		titlePhoto(widget: 'imagebed')
		titlePhotoAlt nullable: true, blank: true
		product nullable: true, blank: true
		galleryPhotoList nullable: true, blank: true, widget: 'multi-imagebed'
		contentHTML(widget:'textarea')
    }
	
	static mapping = {
		contentHTML type: 'text'
	}
	
	@Override
	public String toString() {
		name
	}
	
	Photo addPhoto(String url) {
		def newPhoto = Photo.createPhoto(url);
		this.addToGalleryPhotoList(newPhoto);
		newPhoto
	}
}
