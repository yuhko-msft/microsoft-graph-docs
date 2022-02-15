---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PermissionGrantPolicy()
requestBody.displayName = "Custom permission grant policy";
async () => {
	await graphServiceClient.policies.permissionGrantPoliciesById("permissionGrantPolicy-id").patch(requestBody);
}


```