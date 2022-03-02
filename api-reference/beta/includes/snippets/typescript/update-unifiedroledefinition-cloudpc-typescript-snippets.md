---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new UnifiedRoleDefinition()
requestBody.description = "Update basic properties and permission of application registrations";
requestBody.displayName = "ExampleCustomRole";
const unifiedrolepermission = new UnifiedRolePermission();
unifiedrolepermission.additionalData = new Map<string, unknown>([
					["allowedResourceActions", [
							"Microsoft.CloudPC/CloudPCs/Read",
							"Microsoft.CloudPC/CloudPCs/Reprovision"
						]
				]);
requestBody.rolePermissions = [
			unifiedrolepermission
		]
async () => {
	await graphServiceClient.roleManagement.cloudPC.roleDefinitionsById("unifiedRoleDefinition-id").patch(requestBody);
}


```