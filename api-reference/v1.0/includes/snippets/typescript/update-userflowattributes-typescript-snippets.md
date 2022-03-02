---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new IdentityUserFlowAttribute()
requestBody.description = "Your new hobby";
async () => {
	await graphServiceClient.identity.userFlowAttributesById("identityUserFlowAttribute-id").patch(requestBody);
}


```