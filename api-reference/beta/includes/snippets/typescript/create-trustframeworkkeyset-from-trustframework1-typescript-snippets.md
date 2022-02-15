---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new TrustFrameworkKeySet()
requestBody.id = "keyset1";
const result = async () => {
	await graphServiceClient.trustFramework.keySets.post(requestBody);
}


```