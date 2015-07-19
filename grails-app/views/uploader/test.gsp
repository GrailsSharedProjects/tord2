<html>
<head>

		<meta name="layout" content="XXX"/>
	    
  		<link rel="stylesheet" href="/assets/bootstrap.css?compile=false"  />
<script src="/assets/jquery.min.js?compile=false" type="text/javascript" ></script>
	</head>
	<body>
		
    <input id="input" type=button value=click
    data-toggle="modal" 
   data-target="#imageModal" data-save="1"
    />
    
 
<!-- 模态框（Modal） -->
<div class="modal fade" id="imageModal" tabindex="-1" role="dialog" 
   aria-labelledby="imageModalLabel" aria-hidden="true" style="margin-top: 30px;">
	<div class="modal-dialog  modal-lg" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="imageModalLabel">图片选择器</h4>
			</div>
			<div class="modal-body">
				XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
				<button type="button" class="btn btn-primary"
					onclick="selectPicture()" data-dismiss="modal">选择</button>
			</div>
		</div><!-- /.modal-content -->
	</div>
</div><!-- /.modal -->
<script>
	$(document).ready(function() {
		$('#imageModal').on('show.bs.modal', function(event) {
			console.log(11111)
			alert()
		})
	})
</script>


<script src="/assets/bootstrap.min.js?compile=false" type="text/javascript" ></script>

	</body>
</html>