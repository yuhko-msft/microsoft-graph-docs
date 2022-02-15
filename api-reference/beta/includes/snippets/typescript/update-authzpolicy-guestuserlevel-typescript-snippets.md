---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AuthorizationPolicy()
requestBody.additionalData = new Map([
		["guestUserRole", "2af84b1e-32c8-42b7-82bc-daa82404023b"];
	]);
async () => {
	await graphServiceClient.policies.authorizationPolicyById("authorizationPolicy-id").patch(requestBody);
}


```