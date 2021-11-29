---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Device()
requestBody.additionalData = new Map([
			 ["extensionAttribute1" , "BYOD-Device"],
	]);
async () => {
	await graphServiceClient.devicesById("device-id").patch(requestBody);
}


```