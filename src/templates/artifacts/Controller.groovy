@artifact.package@class @artifact.name@ {

    def index() { 
		def pageData = Page.findByName("");
		model:[pageData: pageData]
	}
}
