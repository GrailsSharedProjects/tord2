<div>
	<g:select name="${fieldName }_listbox" from="${listBox}" optionKey="id"/>
	<g:select name="${fieldName }" from="${target}" value="${target*.id}" optionKey="id" multiple="multiple" />
	<script>
		jQuery("select[name='${fieldName }']").imagebed({multi: true, editable: true});
	</script>
</div>