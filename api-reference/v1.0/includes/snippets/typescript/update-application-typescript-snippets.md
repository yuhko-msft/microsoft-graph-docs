---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Application()
requestBody.displayName = "New display name";
async () => {
	await graphServiceClient.applicationsById("application-id").patch(requestBody);
}


```