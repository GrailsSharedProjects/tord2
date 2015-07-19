package uploader
import com.tord.Photo;

import grails.converters.JSON

class UploaderController {

    def index() {
    	println "inside controller: " + params       
    }
    
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
	
	def test() {}
	
    def success(){
		println "inside controller: " + params
    	def url = params.id + "." + params.format;
    	println url
    	render view:'success', model:['imageUrl': url]
    }
	
	def widget() {
		def fieldName = params.id
		render template: 'upload-widget'
	}
	
	def singlePhoto() {
		
		def photo = params.photo;
		if(!photo) {
			def id = params.id
			println id
			photo = Photo.findById(id)
		}
		
		println photo
		
		def fieldName = params.fieldName
		println fieldName
		
		if(photo) {
			render template:'single-photo', model:[fieldName: fieldName, photo: photo, editable: true]			
		}else {
			render ""
		}	
	}
}
