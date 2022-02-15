---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new IdentityProvider()
requestBody.additionalData = new Map([
		["responseType", "id_token"];
	]);
async () => {
	await graphServiceClient.identityProvidersById("identityProvider-id").patch(requestBody);
}


```