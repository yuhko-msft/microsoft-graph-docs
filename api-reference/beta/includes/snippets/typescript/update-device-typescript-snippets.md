---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Device()
requestBody.accountEnabled = false;
async () => {
	await graphServiceClient.devicesById("device-id").patch(requestBody);
}


```