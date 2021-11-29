---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new IdentityProvider()
requestBody.clientSecret = "1111111111111";
async () => {
	await graphServiceClient.identityProvidersById("identityProvider-id").patch(requestBody);
}


```