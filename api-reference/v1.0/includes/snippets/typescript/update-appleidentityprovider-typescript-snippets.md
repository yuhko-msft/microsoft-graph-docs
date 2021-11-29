---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new IdentityProviderBase()
requestBody.displayName = "Apple";
async () => {
	await graphServiceClient.identity.identityProvidersById("identityProviderBase-id").patch(requestBody);
}


```