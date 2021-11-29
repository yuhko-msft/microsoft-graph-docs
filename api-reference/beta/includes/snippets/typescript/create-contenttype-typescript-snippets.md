---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ContentType()
requestBody.name = "docSet";
requestBody.description = "custom docset";
requestBody.base = new ContentType();
requestBody.base.additionalData = new Map([
			["name", "Document Set"];
			["id", "0x0120D520"];
		]);
requestBody.group = "Document Set Content Types";
const result = async () => {
	await graphServiceClient.sitesById("site-id").contentTypes.post(requestBody);
}


```