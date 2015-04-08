<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="Luploader"/>
    <title>simple upload</title>
</head>
<body>
    <input id="input" multiple="multiple" type="file" name="fin" accept="image/*">
    <div id="drag">
        <div id="title">
            <strong>脱拽文件到这里，或者点击这里上传文件喵~</strong>
            <strong id="process"></strong>
        </div>
        <div class="wrap">
            <div id="icon"></div>
        </div>
        <div class="wrap">
            <div id="iconLoading"></div>
        </div>
    </div>
</body>
</html>