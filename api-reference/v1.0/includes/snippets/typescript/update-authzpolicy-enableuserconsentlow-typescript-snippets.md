---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AuthorizationPolicy()
requestBody.defaultUserRolePermissions = new DefaultUserRolePermissions();
requestBody.defaultUserRolePermissions.permissionGrantPoliciesAssigned = [
				"managePermissionGrantsForSelf.microsoft-user-default-low"
			]
async () => {
	await graphServiceClient.policies.authorizationPolicy.patch(requestBody);
}


```