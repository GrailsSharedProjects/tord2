// The main file for upaloder
//= require jquery.min.js
//= require_self

function setProgress (p) {
    if (p < 0) {
        $('#iconLoading').height(0);
        $('#process').text('');
    }
    else {
        p = p+'%';
        $('#iconLoading').height(p);
        $('#process').text('文件已上传'+p);
    }
}
function sendFile (f) {
    var uploadUrl = app_webroot + 'uploader/upload';
    $.ajax({
        xhr: function() {
            var xhrobj = $.ajaxSettings.xhr();
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
        success: function (msg) {
        	if(msg.key == "error"){
        		alert("Error! " + msg.value);
        		window.location.href = app_webroot +'uploader';
        	}else{
        		window.location.href = app_webroot +'uploader/success/'+msg.value;
        	}
        },
        error: function (e) {
        }
    });
}
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
$('#input').on('change', function (e) {
    var fs = e.target.files || e.dataTransfer && e.dataTransfer.files;
    handleFiles(fs);
})
$('#drag').on('click', function (e) {
    e.stopPropagation();
    e.preventDefault();
    $('#input').trigger('click');
});
$('#drag').on('dragenter', function(e) {
    e.stopPropagation();
    e.preventDefault();
});
$('#drag').on('dragover', function(e) {
    e.stopPropagation();
    e.preventDefault();
});
$('#drag').on('drop', function(e) {
    e.stopPropagation();
    e.preventDefault();
    var a = e.originalEvent;
    var fs = a.target.files || a.dataTransfer && a.dataTransfer.files;
    handleFiles(fs);
});
