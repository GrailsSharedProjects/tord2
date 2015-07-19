${domainName }
<br/>
${fieldName }
<br/>
${target}
<br/>
${listBox}

<g:select name="${fieldName }" from="${listBox}" value="${target*.id}" 
optionKey="id" multiple="multiple" size="5" class="many-to-many"/>