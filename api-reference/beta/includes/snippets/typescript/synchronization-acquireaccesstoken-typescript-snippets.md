---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.credentials = [
			new SynchronizationSecretKeyStringValuePair();
requestBody.credentials.additionalData = new Map([
					["@odata.type", "microsoft.graph.synchronizationSecretKeyStringValuePair"];
				]);
		]
	],
async () => {
	await graphServiceClient.applicationsById("application-id").synchronization.acquireAccessToken.post(requestBody);
}


```