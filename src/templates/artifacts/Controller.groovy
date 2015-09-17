@artifact.package@
import com.tord.admin.Page

class @artifact.name@ {

	def afterInterceptor = [action: this.&applyPageData] 
	
	private applyPageData(model){
		model.pageData = Page.findByName("ADMIN_PAGE");
	}
	
    def index() {
	}
}
