function setProgress (p) {
    if (p < 0) {
        jQuery('.uploader .uploaderIconLoading').height(0);
        jQuery('.uploader .uploaderProcess').text('');
    }
    else {
        p = p+'%';
        jQuery('.uploader .uploaderIconLoading').height(p);
        jQuery('.uploader .uploaderProcess').text('文件已上传'+p);
    }
}

function sendFile (f) {
    var uploadUrl = '/uploader/upload';
    jQuery.ajax({
        xhr: function() {
            var xhrobj = jQuery.ajaxSettings.xhr();
            if (xhrobj.upload) {
                xhrobj.upload.addEventListener('progress', function (e) {
                    var percent = 0;
                    var position = e.loaded || e.position;
                    var total = e.total;
                    if (e.lengthComputable) {
                        percent = Math.ceil(position / total * 100);
                    }
                    setProgress(percent);
                }, false);
            }
            return xhrobj;
        },
        url: uploadUrl,
        type: 'POST',
        contentType: false,
        processData: false,
        cache: false,
        data: f,
        success: function(msg){
        	afterUpload(msg)
        },
        error: function (e) {
        	alert("发生错误，请刷新重试。")
        }
    });
    
    function afterUpload(msg) {
    	if(msg.success){
    		var relPath = msg.msg;
    		jQuery(".image-picker a").find("img").removeClass("checked");
    		jQuery(".upload-widget .uploaderImage").html("<img src=\""+relPath+"\" data-id=\""+relPath.split("?id=")[1]+"\" class=\"checked\" />");
    		jQuery(".upload-widget .uploadedSection").show();
    		jQuery(".upload-widget .uploadedSection h6").click();
    	}else{
    		alert("Error! " + msg.msg);
    	}
    }
}

function initUploader(){
	jQuery('.uploader .uploaderInput').on('change', function (e) {
	    var fs = e.target.files || e.dataTransfer && e.dataTransfer.files;
	    handleFiles(fs);
	})
	jQuery('.uploader .uploaderDrag').on('click', function (e) {
	    e.stopPropagation();
	    e.preventDefault();
	    jQuery('.uploader .uploaderInput').trigger('click');
	});
	jQuery('.uploader .uploaderDrag').on('dragenter', function(e) {
	    e.stopPropagation();
	    e.preventDefault();
	});
	jQuery('.uploader .uploaderDrag').on('dragover', function(e) {
	    e.stopPropagation();
	    e.preventDefault();
	});
	jQuery('.uploader .uploaderDrag').on('drop', function(e) {
	    e.stopPropagation();
	    e.preventDefault();
	    var a = e.originalEvent;
	    var fs = a.target.files || a.dataTransfer && a.dataTransfer.files;
	    handleFiles(fs);
	});
	
	function handleFiles (files) {
	    for (var i = 0; i < files.length; i++) {
	        var fd = new FormData();
	        if (files[i].type.match('image.*')) {
	            fd.append('file', files[i])     
	            sendFile(fd);
	            break;
	        }
	    }
	}
}

function initImagePicker(){
	jQuery(".image-picker a").on('click', function(){
		jQuery(".image-picker a").find("img").removeClass("checked");
		jQuery(this).find("img").addClass("checked");
	});
}