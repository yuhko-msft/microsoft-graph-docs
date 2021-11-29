---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new FieldValueSet()
requestBody.additionalData = new Map([
		["Color", "Fuchsia"];
		["Quantity", 934];
	]);
async () => {
	await graphServiceClient.sitesById("site-id").listsById("list-id").itemsById("listItem-id").fields.patch(requestBody);
}


```