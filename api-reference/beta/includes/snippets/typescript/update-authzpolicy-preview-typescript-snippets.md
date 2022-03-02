---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AuthorizationPolicy()
requestBody.enabledPreviewFeatures = [
			"assignGroupsToRoles"
		]
async () => {
	await graphServiceClient.policies.authorizationPolicyById("authorizationPolicy-id").patch(requestBody);
}


```