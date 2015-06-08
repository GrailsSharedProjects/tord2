<html>
	<head>
		<title>Grails Runtime Exception</title>
		<meta name="layout" content="security" />
		<g:set var="layout_nomainmenu"		value="${true}" scope="request"/>
		<g:set var="layout_nosecondarymenu"	value="${true}" scope="request"/>
	</head>

  <body>

	<g:if test="${exception}">
		<section id="exception">
		    <h2>Stack Trace</h2>
		    <div class="stack">
		      <pre><g:each in="${exception.stackTraceLines}">${it.encodeAsHTML()}<br/></g:each></pre>
		    </div>
		</section>
	</g:if>
	
  </body>
</html>