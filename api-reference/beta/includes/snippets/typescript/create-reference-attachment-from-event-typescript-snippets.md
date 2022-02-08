---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Attachment()
requestBody.name = "Personal pictures";
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.referenceAttachment"];
		["sourceUrl", "https://contoso.com/personal/mario_contoso_net/Documents/Pics"];
		["providerType", "oneDriveConsumer"];
		["permission", "Edit"];
		["isFolder", "True"];
	]);
const result = async () => {
	await graphServiceClient.me.eventsById("event-id").attachments.post(requestBody);
}


```