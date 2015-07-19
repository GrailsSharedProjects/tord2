<%--
${domainName }-${fieldName }-${target}-${listBox}
<br/><br/>
<g:if test="${!required }">
	<g:select 
	id="${fieldName }"
	name="${fieldName + ".id"}" 
	from="${listBox}" 
	optionKey="id" 
	value="${target?.id}"
	class="many-to-many"
	required=""
	/>
</g:if>
<g:else>
	<g:select 
	id="${fieldName }"
	name="${fieldName + ".id"}" 
	from="${listBox}" 
	optionKey="id" 
	value="${target?.id}"
	class="many-to-many"
	noSelection="['':'-- 选择 --']"
	/>
</g:else>
--%>

<div id="imagebed_${fieldName }_">
	<div class="image-target">
	
		<g:render template="single-photo" contextPath="/uploader" model="${[fieldName:fieldName, photo:target]}" />
	
	</div>
	
	<!-- 按钮触发模态框 -->
	<input type="button" value="选择图片" class="open-btn btn btn-primary btn-lg" />
	
	<!-- 模态框（Modal） -->
	<div class="modal fade image-modal" tabindex="-1" role="dialog" style="margin-top: 30px;">
		<div class="modal-dialog  modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span></button>
					<h4 class="modal-title">图片选择器</h4>
				</div>
				<div class="modal-body">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭
					</button>
					<button type="button" class="btn btn-primary action-btn" data-dismiss="modal">选择</button>
				</div>
			</div><!-- /.modal-content -->
		</div>
	</div><!-- /.modal -->
	
	<script>
	$("#imagebed_${fieldName }_").each(function(){
		var targetField = '${fieldName}';
		var imgBed = jQuery(this);
		var modal = imgBed.find('.image-modal');
		var openBtn = imgBed.find('.open-btn');
		var actionBtn = modal.find('.action-btn');

		openBtn.click(function(){
			imgBed.find('.image-modal').modal('show');
		});
		
		modal.on('show.bs.modal', function(event) {
			<g:remoteFunction controller="uploader" action="widget" id="targetField"
			onSuccess="loaded(data)"/>

				function loaded(data){
					modal.find(".modal-body").html(data);
					initAccordion();
					initImagePicker();
					initUploader();
				}
		});
		
		actionBtn.click(function(){
			var id = modal.find(".image-picker a").find("img.checked").attr("data-id");

			<g:remoteFunction controller="uploader" action="singlePhoto" 
				params="'id='+id+'&fieldName='+targetField"
				onSuccess="loaded1(data)" />

			function loaded1(data){
				imgBed.find(".image-target").html(data);
			}
		});

		modal.on('hidden.bs.modal', function(event) {
			modal.find(".modal-body").html("");
		});
		
	});
	</script>

</div>