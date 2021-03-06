package com.tord.imagebed
import com.tord.Photo;

import grails.converters.JSON

class ImagebedController {

	def upload() {
		println "inside controller: " + params
		if(params.file){
				def f = request.getFile('file');
					println f.size;
					if(!f.empty) {
						def webRootDir = servletContext.getRealPath("/")
						println webRootDir
						def date = new Date().getCalendarDate();
						def path = "/uploaded/${date.getYear()}/${date.getMonth()}/${date.getDayOfMonth()}/"
						
						println "userDIR: " + path
						
						def userDir = new File(webRootDir, path)
						userDir.mkdirs();
						
						def String fName = f.originalFilename;
						fName = fName.replaceAll("[\\\\/:\\*\\?\"\\<\\>\\| ]", "_")
						
						println "fileName:" + fName;
						
						def localFile = new File( userDir, fName);
						f.transferTo(localFile)
						def photo = Photo.createPhoto(path+fName, f.originalFilename);
						def msg = new Msg(success:true, msg: photo.url+"?id="+photo.id, file_path: photo.url);
						render msg as JSON
						return;
				  }
				  render new Msg(success:false, msg:"file is empty.") as JSON
				  return;
		}
		render new Msg(success:false, msg:"no file uploaded.") as JSON
	}
	
	def widget() {
		render view: 'widget'
	}
	
	def photo() {
		def id = params.id;
		def fieldName = params['fieldName'];
		def sequence = params['sequence'];
		def editable = false;
		if(params['editable'] == "true" || params['editable'] == true){
			editable = true;
		}
		def photo = com.tord.Photo.findById(id);
		
		render view:'photo', model:[
			photo: photo,
			fieldName: fieldName,
			sequence: sequence
			]
	}
}
