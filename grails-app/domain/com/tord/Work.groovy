package com.tord

import java.util.Date;

import org.grails.taggable.Taggable

import com.tord.admin.Menu;
import com.tord.admin.MenuStyle;

class Work implements TDomainOperations, Taggable{
	String name
	String category
	Boolean showOnHomePage = false;
	
	//Tag tag
	String title
	Photo titlePhoto
	String titlePhotoAlt
	Product product
	String contentHTML
	
	List<Photo> galleryPhotoList
	static hasMany = [galleryPhotoList: Photo]
	
	Date dateCreated
	Date lastUpdated
	
    static constraints = {
		name unique: true
		category inList:['portfolio', 'project']
		showOnHomePage()
		title()
		titlePhoto widget: 'imagebed'
		titlePhotoAlt nullable: true, blank: true
		product nullable: true, blank: true
		galleryPhotoList nullable: true, blank: true, widget: 'multi-imagebed'
		contentHTML widget:'textarea'
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
