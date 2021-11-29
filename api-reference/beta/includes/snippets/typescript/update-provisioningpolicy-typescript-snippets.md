---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new CloudPcProvisioningPolicy()
requestBody.displayName = "Display Name value";
requestBody.description = "Description value";
requestBody.onPremisesConnectionId = "4e47d0f6-6f77-44f0-8893-c0fe1701ffff";
requestBody.imageId = "Image ID value";
requestBody.imageDisplayName = "Image Display Name value";
requestBody.imageType = "custom";
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.cloudPcProvisioningPolicy"];
	]);
async () => {
	await graphServiceClient.deviceManagement.virtualEndpoint.provisioningPoliciesById("cloudPcProvisioningPolicy-id").patch(requestBody);
}


```