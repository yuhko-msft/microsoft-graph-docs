---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new IdentitySecurityDefaultsEnforcementPolicy()
requestBody.isEnabled = false;
async () => {
	await graphServiceClient.policies.identitySecurityDefaultsEnforcementPolicy.patch(requestBody);
}


```