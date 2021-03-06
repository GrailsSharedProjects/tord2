// locations to search for config files that get merged into the main config;
// config files can be ConfigSlurper scripts, Java properties files, or classes
// in the classpath in ConfigSlurper format

// grails.config.locations = [ "classpath:${appName}-config.properties",
//                             "classpath:${appName}-config.groovy",
//                             "file:${userHome}/.grails/${appName}-config.properties",
//                             "file:${userHome}/.grails/${appName}-config.groovy"]

// if (System.properties["${appName}.config.location"]) {
//    grails.config.locations << "file:" + System.properties["${appName}.config.location"]
// }

grails.project.groupId = appName // change this to alter the default package name and Maven publishing destination

// The ACCEPT header will not be used for content negotiation for user agents containing the following strings (defaults to the 4 major rendering engines)
grails.mime.disable.accept.header.userAgents = ['Gecko', 'WebKit', 'Presto', 'Trident']
grails.mime.types = [ // the first one is the default format
    all:           '*/*', // 'all' maps to '*' or the first available format in withFormat
    atom:          'application/atom+xml',
    css:           'text/css',
    csv:           'text/csv',
    form:          'application/x-www-form-urlencoded',
    html:          ['text/html','application/xhtml+xml'],
    js:            'text/javascript',
    json:          ['application/json', 'text/json'],
    multipartForm: 'multipart/form-data',
    rss:           'application/rss+xml',
    text:          'text/plain',
    hal:           ['application/hal+json','application/hal+xml'],
    xml:           ['text/xml', 'application/xml']
]

// URL Mapping Cache Max Size, defaults to 5000
//grails.urlmapping.cache.maxsize = 1000

// Legacy setting for codec used to encode data with ${}
grails.views.default.codec = "html"

// The default scope for controllers. May be prototype, session or singleton.
// If unspecified, controllers are prototype scoped.
grails.controllers.defaultScope = 'singleton'

// GSP settings
grails {
    views {
        gsp {
            encoding = 'UTF-8'
            htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
            codecs {
                expression = 'html' // escapes values inside ${}
                scriptlet = 'html' // escapes output from scriptlets in GSPs
                taglib = 'none' // escapes output from taglibs
                staticparts = 'none' // escapes output from static template parts
            }
        }
        // escapes all not-encoded output at final stage of outputting
        // filteringCodecForContentType.'text/html' = 'html'
    }
}


grails.converters.encoding = "UTF-8"
// scaffolding templates configuration
grails.scaffolding.templates.domainSuffix = 'Instance'

// Set to false to use the new Grails 1.2 JSONBuilder in the render method
grails.json.legacy.builder = false
// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true
// packages to include in Spring bean scanning
grails.spring.bean.packages = []
// whether to disable processing of multi part requests
grails.web.disable.multipart=false

// request parameters to mask when logging exceptions
grails.exceptionresolver.params.exclude = ['password']

// configure auto-caching of queries by default (if false you can cache individual queries with 'cache: true')
grails.hibernate.cache.queries = false

// configure passing transaction's read-only attribute to Hibernate session, queries and criterias
// set "singleSession = false" OSIV mode in hibernate configuration after enabling
grails.hibernate.pass.readonly = false
// configure passing read-only to OSIV session by default, requires "singleSession = false" OSIV mode
grails.hibernate.osiv.readonly = false

grails.app.context = "/"

environments {
    development {
        grails.logging.jul.usebridge = true
    }
    production {
        grails.logging.jul.usebridge = false
        grails.serverURL = "http://www.tordchina.com"
		//grails.assets.storagePath = "F:\\node_work\\tord2\\web-app\\uploaded"
    }
}

// log4j configuration
log4j.main = {
    // Example of changing the log pattern for the default console appender:
    //
    //appenders {
    //    console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
    //}

    error  'org.codehaus.groovy.grails.web.servlet',        // controllers
           'org.codehaus.groovy.grails.web.pages',          // GSP
           'org.codehaus.groovy.grails.web.sitemesh',       // layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping',        // URL mapping
           'org.codehaus.groovy.grails.commons',            // core / classloading
           'org.codehaus.groovy.grails.plugins',            // plugins
           'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
           'org.springframework',
           'org.hibernate'

		   
		   warn 'grails.app.services.grails.plugin.springsecurity.ui.SpringSecurityUiService'
	   
		   debug 'net.sf.ehcache.hibernate',
		   	     'com.tord'
}

// assets
grails.assets.excludes = ["tiny_mce/src/*.js"]
grails.assets.includes = ["**/*.map"]

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.tord.auth.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.tord.auth.UserRole'
grails.plugin.springsecurity.authority.className = 'com.tord.auth.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	'/dbconsole/**':                ['ROLE_ADMIN'],

	'/user/**':                ['ROLE_ADMIN'],
	'/role/**':                ['ROLE_ADMIN'],
	'/registrationCode/**':                ['ROLE_ADMIN'],
	'/securityInfo/**':                ['ROLE_ADMIN'],
	
	'/admin/**':                ['ROLE_ADMIN'],
	'/imagebed/**':                ['ROLE_ADMIN'],
	'/work/**':                ['ROLE_ADMIN'],
	'/article/**':                ['ROLE_ADMIN'],
	'/product/**':                ['ROLE_ADMIN'],
	'/widget/**':                ['ROLE_ADMIN'],
	'/sliderRevolution/**':                ['ROLE_ADMIN'],
	'/slider/**':                ['ROLE_ADMIN'],
	'/menu/**':                ['ROLE_ADMIN'],
	'/page/**':                ['ROLE_ADMIN'],
	'/header/**':                ['ROLE_ADMIN'],
	'/footer/**':                ['ROLE_ADMIN'],
	'/footerModule/**':                ['ROLE_ADMIN'],
	'/photo/**':                ['ROLE_ADMIN'],
	'/siteSettings/**':                ['ROLE_ADMIN'],
	
	'/home/**':                ['permitAll'],
	'/portfolio/**':                ['permitAll'],
	'/blog/**':                ['permitAll'],
	'/project/**':                ['permitAll'],
	'/shop/**':                ['permitAll'],
	'/info/**':                ['permitAll'],

	'/uploaded/*.jpg':                ['permitAll'],
	'/uploaded/*.png':                ['permitAll'],
	'/uploaded/*.gif':                ['permitAll'],
	
	'/':                              ['permitAll'],
	'/index':                         ['permitAll'],
	'/index.gsp':                     ['permitAll'],
	'/assets/**':                     ['permitAll'],
	'/**/js/**':                      ['permitAll'],
	'/**/css/**':                     ['permitAll'],
	'/**/images/**':                  ['permitAll'],
	'/**/favicon.ico':                ['permitAll'],
	
	'/login/**':                ['permitAll'],
	'/logout/**':                ['permitAll'],
	'/register/**':                ['permitAll'],
	'/**' : ['permitAll'],
]
grails.plugin.springsecurity.logout.handlerNames = [
	'rememberMeServices', 'securityContextLogoutHandler' //, 'myLogoutHandler'
 ]

// global settings
def emailSmtp = "smtp.163.com";
def emailFrom = "quiet_dog@163.com";

// mail api
grails {
	mail {
	   host = emailSmtp
	   port = 465
	   username = emailFrom
	   password = "hsbhrsc"
	   props = [ "mail.smtp.auth":"true",
						"mail.smtp.socketFactory.port":"465",
						"mail.smtp.socketFactory.class":"javax.net.ssl.SSLSocketFactory",
						"mail.smtp.socketFactory.fallback":"false"  ]
	}
 }

// security ui
grails.plugin.springsecurity.ui.register.emailBody = '''\
Hi ${user.username},<br/>
&nbsp;&nbsp;Please click <a href="${url}">here</a> to finish your registration.<br/>
Yours,<br/>
Tord Inc.'''
grails.plugin.springsecurity.ui.register.emailFrom = emailFrom
grails.plugin.springsecurity.ui.register.emailSubject = 'Confirm Registration - Tord'
grails.plugin.springsecurity.ui.register.defaultRoleNames = ['ROLE_USER']
grails.plugin.springsecurity.ui.register.postRegisterUrl = '/'

grails.plugin.springsecurity.ui.password.minLength = 8
grails.plugin.springsecurity.ui.password.maxLength	= 64
grails.plugin.springsecurity.ui.password.validationRegex = '^.*(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&]).*$'

grails.plugin.springsecurity.ui.forgotPassword.emailBody = '''\
Hi ${user.username},<br/>
&nbsp;&nbsp;Please click <a href="${url}">here</a> to reset your password.<br/>
Yours,<br/>
Tord Inc.'''
grails.plugin.springsecurity.ui.forgotPassword.emailFrom = emailFrom
grails.plugin.springsecurity.ui.forgotPassword.emailSubject = 'Reset Password - Tord'
grails.plugin.springsecurity.ui.forgotPassword.postResetUrl = '/'

grails.gorm.failOnError = true;