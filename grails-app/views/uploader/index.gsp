<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="uploader"/>
    <title>simple upload</title>
</head>
<body>
	
	<g:photo photo="${ com.tord.Photo.findById(1) }"/>
	<g:photo id="2"/>
	<g:photo url="/uploaded/14210513261.jpg"/>

    <input id="input" multiple="multiple" type="file" name="fin" accept="image/*">
    <div id="drag">
        <div id="title">
            <strong>脱拽文件到这里，或者点击这里上传文件</strong>
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