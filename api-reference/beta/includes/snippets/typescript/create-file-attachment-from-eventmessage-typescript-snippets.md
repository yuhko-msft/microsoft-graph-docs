---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Attachment()
requestBody.name = "name-value";
requestBody.contentType = "contentType-value";
requestBody.isInline = false;
requestBody.additionalData = new Map([
		["@odata.type", "#Microsoft.OutlookServices.FileAttachment"];
		["contentLocation", "contentLocation-value"];
		["contentBytes", "contentBytes-value"];
	]);
const result = async () => {
	await graphServiceClient.me.messagesById("message-id").attachments.post(requestBody);
}


```