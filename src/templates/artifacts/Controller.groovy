@artifact.package@class @artifact.name@ {

    def index() { 
		def pageData = Page.findByName("ADMIN_PAGE");
		model:[pageData: pageData]
	}
}
