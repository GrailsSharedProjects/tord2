<g:if test="${photo }">
<g:photo photo="${photo }" title="${photo?.originalFileName?.split('\\.')[0] }"
 data-toggle="popover" data-placement="top" data-trigger="hover" data-content="ID: ${photo?.id } &lt;br/&gt;URL: ${photo?.url }" data-html="true" 
 class="trigger" data-id="${photo?.id }" data-field-name="${fieldName }" data-sequence="${sequence }"
/>
</g:if>
