---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.isSyncedFromOnPremises = "Boolean";
const result = async () => {
	await graphServiceClient.directoryObjects.getAvailableExtensionProperties.post(requestBody);
}


```