<div class="upload-widget tzaccordion">
	<div class="tzaccordion-section">
		<h6 class="active">
			<i class="fa fa-chevron-down"></i>选择一张图片
		</h6>
		<div class="pp" style="display: block;">
			<ul class="tz-recent-porjects image-picker">
				<g:each in="${com.tord.Photo.list() }" var="photo">
					<li><a href="javascript:void(0);">
						<g:photo photo="${photo }" data-toggle="popover" data-id="${photo?.id }"
			        	title="#${photo?.id }# 《${photo?.originalFileName }》" data-placement="top" data-trigger="hover"
			        	data-content="${photo?.url }" />
					</a></li>
				</g:each>
			</ul>
			<script>
			jQuery(function () {
				jQuery('[data-toggle="popover"]').popover()
			});
			</script>
		</div>
	</div>
	<div class="tzaccordion-section uploaderSection">
		<h6>
			<i class="fa fa-chevron-right"></i>上传一张图片
		</h6>
		<div class="pp">

			<div class="uploader">
				<input class="uploaderInput" multiple="multiple" type="file"
					name="fin" accept="image/*" />
				<div class="uploaderDrag">
					<div class="uploaderTitle">
						<strong>脱拽文件到这里，或者点击这里上传文件喵~</strong> <strong
							class="uploaderProcess"></strong>
					</div>
					<div class="uploaderWrap">
						<div class="uploaderIcon"></div>
					</div>
					<div class="uploaderWrap">
						<div class="uploaderIconLoading"></div>
					</div>
				</div>
			</div>

		</div>
	</div>
	<div class="tzaccordion-section uploadedSection" style="display: none;">
		<h6>
			<i class="fa fa-chevron-right"></i>已上传
		</h6>
		<div class="pp">
			<div class="image-picker">
				<a class="uploaderImage" href="javascript:void(0);"></a>
			</div>
		</div>
	</div>
</div>