	+function($){
		'use strict';

		var Imagebed = function(element, options){
			this.$element = $(element);
			this.$element.hide();
			this.options = options;
			this.fieldName = this.$element.attr('name');
			if(this.options.multi){
				this.$listbox = $("select[name='"+this.fieldName+"_listbox']");
				this.$listbox.hide();
			}
			// attach target
			this.$element.after('<div class="image-target"></div>');
			this.$target = this.$element.next('.image-target');
		}
		
		Imagebed.version = '1.0.0'
		
		Imagebed.DEFAULTS = {
			multi: false,
			editable: false
		}
		
		Imagebed.prototype.drawTarget = function(){
			var that = this
			
			if(this.options.multi){
				var fieldName = this.fieldName;
				var editable = this.options.editable;
				var html = '<div class="user-photo show-photo">' + '<ul>';
				this.$element.find("option:selected").each(function(){
					var $opt = $(this);
					html += "<li class='toload'>"
						+ $opt.val()
						+ "</li>";
				});
				if(this.options.editable){
					html += '<li class="add-btn-photo">'
						+ '<span class="glyphicon glyphicon-plus trigger" aria-hidden="true" data-sequence='+this.$element.find("option:selected").size()+'></span>'
						+ '</li>'
				}
				html += '</ul>'
				    + '</div>';
				this.$target.html(html);
			}else{
				var html = '<div class="user-photo show-photo">' + '<ul>';
				
				if(this.$element.val() != ""){
					html += "<li class='toload'>"
						+ this.$element.val()
						+ "</li>";
				}else if(this.options.editable){
					html += '<li class="add-btn-photo">'
						+ '<span class="glyphicon glyphicon-plus trigger" aria-hidden="true" data-sequence="0"></span>'
						+ '</li>'
				}
				
				html += '</ul>'
				    + '</div>';
				html += "<!-- 按钮触发模态框 -->";
				html += '<input type="button" value="选择图片" class="trigger btn btn-primary btn-lg" data-sequence="0"/>';
				this.$target.html(html);
			}
			
			this.$target.find("li.toload").each(function(seq){
				var $li = $(this);
				var id = $li.text();
				if(id){
					var url = "/uploader/photo/"+id+"?fieldName="+that.fieldName+"&editable=" + that.options.editable + "&sequence=" + seq;

					jQuery.get(url, function(html){
						$li.removeClass("toload");
						$li.html(html);
						that.registerTriggers();
						jQuery('[data-toggle="popover"]').popover()
					})
				}
			});
		}
		
		Imagebed.prototype.init = function(){
			var that = this
			this.drawTarget();

			// init DOM components inside doc.ready
			$(document).ready(function(){
				var $modal = $("#image-modal");
				if(!$modal.data("wk.imagebed.modal")){
					$modal.data("wk.imagebed.modal", true);
					
					$modal.on('show.bs.modal', function(event) {
						that.fill();
					});
					$modal.on('hidden.bs.modal', function(event) {
						that.clear();
					});
					$modal.find('.action-btn').click(function(){
						var $checkedImg = $modal.find(".image-picker a").find("img.checked");
						var id = $checkedImg.attr("data-id");
						var url = $checkedImg.attr("data-content");
						var fieldName = $modal.data('fieldName');
						var seq = $modal.data('sequence');
						
						var that = $modal.data('instance');
						if(that.options.multi){

							var $opt = that.$listbox.find("option[value="+id+"]");
							var $target = that.$element.find("option:eq("+seq+")");
							
							if($opt && $opt.size()>0){
								var $cOpt = $opt.clone().attr("selected", true)
								if($target && $target.size()>0){
									$target.replaceWith($cOpt);
								}else{
									that.$element.append($cOpt);
								}
							}else{
								that.$listbox.append("<option value='"+id+"'>"+url+"</option>");	
								if($target && $target.size()>0){
									$target.replaceWith("<option value='"+id+"' selected='selected'>"+url+"</option>");
								}else{
									that.$element.append("<option value='"+id+"' selected='selected'>"+url+"</option>");
								}
							}
						}else{
							var $target = that.$element;
							$target.val(id);
						}
						that.drawTarget();
					});
				}
			});
		}

		Imagebed.prototype.registerTriggers = function(){
			var that = this;
			this.$triggers = this.$target.find('.trigger');

			this.$triggers.each(function(){
				var $trigger = $(this);
				if(!$trigger.data("wk.imagebed.click")){
					$trigger.on("click", function(){
						if(that.options.editable){
							that.show($trigger.data("fieldName"), $trigger.data("sequence"));
						}
					});
					$trigger.data("wk.imagebed.click", true);
				}
			});
		}
		
		Imagebed.prototype.show = function(fieldName, sequence){
			var that = this;
			$("#image-modal").modal('show');
			$("#image-modal").data('fieldName', fieldName)
			$("#image-modal").data('sequence', sequence)
			$("#image-modal").data('instance', this)
		}
		
		Imagebed.prototype.fill = function(){
			var that = this;
			
			$.ajax({
				type:'POST', 
				url:'/uploader/widget',
				success:function(data,textStatus){
					$("#image-modal").find(".modal-body").html(data);
					
					initAccordion();
					initImagePicker();
					initUploader();
				},
				error:function(XMLHttpRequest,textStatus,errorThrown){
					// ignore
				}
			});
		}
		
		Imagebed.prototype.hide = function(){
			var that = this;
			$("#image-modal").modal('hide');
		}

		Imagebed.prototype.clear = function(){
			$("#image-modal").find(".modal-body").html("");
		}
		
		Imagebed.prototype.uploaded = function(){
			
		}
		
		  // IMAGEBED PLUGIN DEFINITION
		  // ========================

		  function Plugin(option) {
		    return this.each(function () {
		      var $this   = $(this)
		      var data    = $this.data('wk.imagebed')
		      var options = $.extend({}, Imagebed.DEFAULTS, $this.data(), typeof option == 'object' && option)

		      if (!data) $this.data('wk.imagebed', (data = new Imagebed(this, options)))

		      //if (option == 'toggle') data.toggle()
		      //else if (option) data.setState(option)
		      
		      data.init();
		    })
		  }

		  var old = $.fn.imagebed

		  $.fn.imagebed             = Plugin
		  $.fn.imagebed.Constructor = Imagebed


		  // IMAGEBED NO CONFLICT
		  // ==================

		  $.fn.imagebed.noConflict = function () {
		    $.fn.imagebed = old
		    return this
		  }
		  
	}(jQuery);