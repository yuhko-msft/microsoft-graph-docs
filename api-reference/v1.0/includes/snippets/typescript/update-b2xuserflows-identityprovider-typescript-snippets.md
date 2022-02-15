---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map([
		["@odata.id", "https://graph.microsoft.com/v1.0/identityProviders/Facebook-OAUTH"];
	]);
const result = async () => {
	await graphServiceClient.identity.b2xUserFlowsById("b2xIdentityUserFlow-id").identityProviders.$ref.post(requestBody);
}


```