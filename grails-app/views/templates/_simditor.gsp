<textarea class="editor" placeholder="这里输入内容" autofocus></textarea>
<script type="text/javascript">
var editor = new Simditor({
	textarea : $('.editor'),
	toolbar: ['title', 'bold', 'italic', 'underline', 'strikethrough', 'color', '|', 'ol', 'ul', 'blockquote', 'code', 'table', '|', 'link', 'image', 'hr', '|', 'indent', 'outdent', 'alignment'],
	upload : {
		url : '${g.createLink(controller:'uploader', action:'upload')}',
		params : null,
		fileKey : 'file',
		connectionCount : 3,
		leaveConfirm : '正在上传文件，如果离开上传会自动取消'
	},
});
</script>