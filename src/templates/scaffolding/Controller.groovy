<%=packageName ? "package ${packageName}\n\n" : ''%>

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ${className}Controller {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	
    def index(Integer max) {
		def pageData = Page.findByName("ADMIN_PAGE");
        params.max = Math.min(max ?: 10, 100)
        respond ${className}.list(params), model:[${propertyName}Count: ${className}.count(), pageData: pageData]
    }

    def show(${className} ${propertyName}) {
		def pageData = Page.findByName("ADMIN_PAGE");
        respond ${propertyName}, model:[pageData: pageData]
    }

    def create() {
		def pageData = Page.findByName("ADMIN_PAGE");
        respond new ${className}(params), model:[pageData: pageData]
    }

    @Transactional
    def save(${className} ${propertyName}) {
		def pageData = Page.findByName("ADMIN_PAGE");
        if (${propertyName} == null) {
            notFound()
            return
        }

        if (${propertyName}.hasErrors()) {
            respond ${propertyName}.errors, view:'create', model:[pageData: pageData]
            return
        }

        ${propertyName}.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: '${domainClass.propertyName}.label', default: '${className}'), ${propertyName}.id])
                redirect ${propertyName}
            }
            '*' { respond ${propertyName}, [status: CREATED, pageData: pageData] }
        }
    }

    def edit(${className} ${propertyName}) {
		def pageData = Page.findByName("ADMIN_PAGE");
        respond ${propertyName}, model:[pageData: pageData]
    }

    @Transactional
    def update(${className} ${propertyName}) {
		def pageData = Page.findByName("ADMIN_PAGE");
        if (${propertyName} == null) {
            notFound()
            return
        }

        if (${propertyName}.hasErrors()) {
            respond ${propertyName}.errors, view:'edit', model:[pageData: pageData]
            return
        }

        ${propertyName}.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: '${className}.label', default: '${className}'), ${propertyName}.id])
                redirect ${propertyName}
            }
            '*'{ respond ${propertyName}, [status: OK, pageData: pageData] }
        }
    }

    @Transactional
    def delete(${className} ${propertyName}) {
		def pageData = Page.findByName("ADMIN_PAGE");
        if (${propertyName} == null) {
            notFound()
            return
        }

        ${propertyName}.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: '${className}.label', default: '${className}'), ${propertyName}.id])
                redirect action:"index", method:"GET", model:[pageData: pageData]
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
		def pageData = Page.findByName("ADMIN_PAGE");
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: '${domainClass.propertyName}.label', default: '${className}'), params.id])
                redirect action: "index", method: "GET", model:[pageData: pageData]
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
