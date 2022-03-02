---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map<string, unknown>([
		["@odata.type", "#microsoft.graph.customAccessPackageWorkflowExtension"],
		["displayName", "test_action_0124_email"],
		["description", "this is for graph testing only"]
	]);
async () => {
	await graphServiceClient.identityGovernance.entitlementManagement.accessPackageCatalogsById("accessPackageCatalog-id").customAccessPackageWorkflowExtensionsById("customAccessPackageWorkflowExtension-id").put(requestBody);
}


```