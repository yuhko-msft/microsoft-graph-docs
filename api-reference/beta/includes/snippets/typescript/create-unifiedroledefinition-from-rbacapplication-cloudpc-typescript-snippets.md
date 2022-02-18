---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new UnifiedRoleDefinition()
requestBody.description = "An example custom role";
requestBody.displayName = "ExampleCustomRole";
requestBody.rolePermissions = [
			new UnifiedRolePermission();
requestBody.rolePermissions.additionalData = new Map([
					["allowedResourceActions", [
							"Microsoft.CloudPC/CloudPCs/Read";
						]
					],
				]);
		]
	],
requestBody.additionalData = new Map([
		["condition", "null"];
	]);
const result = async () => {
	await graphServiceClient.roleManagement.cloudPC.roleDefinitions.post(requestBody);
}


```