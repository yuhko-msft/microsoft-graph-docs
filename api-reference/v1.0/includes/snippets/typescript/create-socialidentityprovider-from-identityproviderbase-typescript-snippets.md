---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new IdentityProviderBase()
requestBody.displayName = "Login with Amazon";
requestBody.additionalData = new Map([
		["@odata.type", "microsoft.graph.socialIdentityProvider"];
		["identityProviderType", "Amazon"];
		["clientId", "56433757-cadd-4135-8431-2c9e3fd68ae8"];
		["clientSecret", "000000000000"];
	]);
const result = async () => {
	await graphServiceClient.identity.identityProviders.post(requestBody);
}


```