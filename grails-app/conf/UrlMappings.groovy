class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

		"/"(controller:'home')
        "500"(controller:'errors', action: '500')
        "403"(controller:'errors', action: '403')
        "404"(controller:'errors', action: '404')
        "503"(controller:'errors', action: '503')
	}
}
