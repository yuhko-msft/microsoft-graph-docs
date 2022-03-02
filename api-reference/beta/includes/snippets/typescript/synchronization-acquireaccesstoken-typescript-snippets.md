---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
const synchronizationsecretkeystringvaluepair = new SynchronizationSecretKeyStringValuePair();
synchronizationsecretkeystringvaluepair.additionalData = new Map<string, unknown>([
					["@odata.type", "microsoft.graph.synchronizationSecretKeyStringValuePair"]
				]);
requestBody.credentials = [
			synchronizationsecretkeystringvaluepair
		]
async () => {
	await graphServiceClient.applicationsById("application-id").synchronization.acquireAccessToken.post(requestBody);
}


```