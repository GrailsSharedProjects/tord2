<div class="user-photo show-photo">
    <ul>
        <li>
        	<g:photo photo="${photo }" data-toggle="popover" data-id="${photo?.id }"
        	title="#${photo?.id }# 《${photo?.originalFileName }》" data-placement="top" data-trigger="hover"
        	data-content="${photo?.url }" />
        </li>
    </ul>
</div>
<script>
jQuery(function () {
	jQuery('[data-toggle="popover"]').popover()
});
</script>
<g:if test="${editable }">
	<input type="hidden" id="${fieldName }" name="${fieldName + ".id"}" value="${photo?.id}" readonly="readonly" />
</g:if>
