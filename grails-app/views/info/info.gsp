<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="${pageData.layoutName}"/>
    <title>${(info?.title)?(info.title):(pageData.title) }</title>
</head>
<body>
    <section class="tzsingleblog-wrap">
        <div class="container">
            <h3 class="tz-title-bold-3">${(info?.title)?(info.title):(pageData.title) }</h3>
            <div class="tzpost-content">
            ${raw(info?.contentHTML) }
            </div>
        </div>
    </section>
</body>
</html>