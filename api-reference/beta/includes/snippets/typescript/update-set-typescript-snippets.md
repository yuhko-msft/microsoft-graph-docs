---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Set()
requestBody.description = "mySet";
async () => {
	await graphServiceClient.termStore.setsById("set-id").patch(requestBody);
}


```