---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new UnifiedRoleDefinition()
requestBody.description = "Update basic properties of application registrations";
requestBody.displayName = "Application Registration Support Administrator";
const unifiedrolepermission = new UnifiedRolePermission();
unifiedrolepermission.additionalData = new Map<string, unknown>([
					["allowedResourceActions", [
							"microsoft.directory/applications/basic/read"
						]
				]);
requestBody.rolePermissions = [
			unifiedrolepermission
		]
async () => {
	await graphServiceClient.roleManagement.directory.roleDefinitionsById("unifiedRoleDefinition-id").patch(requestBody);
}


```