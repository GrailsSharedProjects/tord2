<%=packageName ? "package ${packageName}\n\n" : ''%>

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import com.tord.admin.Page 

@Transactional(readOnly = true)
class ${className}Controller {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	
	def afterInterceptor = [action: this.&applyPageData] 
	
	private applyPageData(model){
		model.pageData = Page.findByName("ADMIN_PAGE");
	}
	
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ${className}.list(params), model:[${propertyName}Count: ${className}.count()]
    }

    def show(${className} ${propertyName}) {
        respond ${propertyName}
    }

    def create() {
        respond new ${className}(params)
    }

	def refreshCreate(){
		respond new ${className}(params), view:'create'
	}
	
    @Transactional
    def save(${className} ${propertyName}) {
        if (${propertyName} == null) {
            notFound()
            return
        }

        if (${propertyName}.hasErrors()) {
            respond ${propertyName}.errors, view:'create'
            return
        }

        ${propertyName}.save flush:true

		saveTags(${propertyName}, params.tags);
		
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: '${domainClass.propertyName}.label', default: '${className}'), ${propertyName}.id])
                redirect ${propertyName}
            }
            '*' { respond ${propertyName}, [status: CREATED] }
        }
    }
    
	private void saveTags(instance, tags) {
		if(tags) {
			def parsed = tags.tokenize(',').collect{tag->
				tag?.trim();
			}.unique()
			
			if(!parsed) {
				parsed = []
			}
			
			instance.setTags(parsed)
		}
	}
	
    def edit(${className} ${propertyName}) {
        respond ${propertyName}
    }
	
	def refreshEdit(${className} ${propertyName}){
		respond ${propertyName}, view:'edit'
	}
	
	private replaceListData(p, para, names){
		names.each{ name ->
			p[name].clear();
		}
		p.properties = para;
	}
	
    @Transactional
    def update(${className} ${propertyName}) {
    	log.debug("PARAMS: " + params)
		
		def names = [];
		${propertyName}.properties.each{k,v->
			if(v instanceof List){
				if(k != "tags"){
					names.add(k);
				}
			}
		}
		replaceListData(${propertyName}, params, names)
		
        if (${propertyName} == null) {
            notFound()
            return
        }

        if (${propertyName}.hasErrors()) {
            respond ${propertyName}.errors, view:'edit'
            return
        }

        ${propertyName}.save flush:true

		saveTags(${propertyName}, params.tags);
		
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: '${className}.label', default: '${className}'), ${propertyName}.id])
                redirect ${propertyName}
            }
            '*'{ respond ${propertyName}, [status: OK] }
        }
    }

    @Transactional
    def delete(${className} ${propertyName}) {
        if (${propertyName} == null) {
            notFound()
            return
        }

        ${propertyName}.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: '${className}.label', default: '${className}'), ${propertyName}.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: '${domainClass.propertyName}.label', default: '${className}'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
	
	def imagebed(){
		log.debug("INSIDE ${className}Controller.imagebed() ....")
		
		${className} ${propertyName} = request["${propertyName}"];
		String fieldName = request["fieldName"];
		String required = request["required"];
		
		log.debug("${propertyName}: " + ${propertyName});
		log.debug("fieldName: " + fieldName);
		log.debug("fieldValue: " + ${propertyName}[fieldName]);
		log.debug("required: " + required);
		
		render view:'/imagebed/single', model:[instanceId: ${propertyName}.id, instanceName: '${propertyName}', fieldName: fieldName, target:${propertyName}[fieldName], required: required]
	}
	
	def ibed(${className} ${propertyName}){
		
	}
	
	def "multi-imagebed"(${className} ${propertyName}){
		log.debug("INSIDE ${className}Controller.multi-imagebed() ....")
		
		println "Property: " + ${propertyName};
		if(${propertyName} == null){
			${propertyName} = request["${propertyName}"];
		}
		String fieldName = request["fieldName"];
		String required = request["required"];
		
		log.debug("${propertyName}: " + ${propertyName});
		log.debug("fieldName: " + fieldName);
		log.debug("fieldValue: " + ${propertyName}[fieldName]);
		log.debug("required: " + required);
		
		render view:'/imagebed/multi', model:[
			instanceId: ${propertyName}.id,
			instanceName: '${propertyName}', 
			fieldName: fieldName, 
			target:${propertyName}[fieldName], 
			listBox: com.tord.Photo.list(),
			required: required
			]
	}
	
}
