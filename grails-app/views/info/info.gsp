<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="${pageData.layoutName}"/>
    <title>${(info?.title)?(info.title):(pageData.title) }</title>
</head>
<body>
    ${raw(info?.contentHTML) }
</body>
</html>