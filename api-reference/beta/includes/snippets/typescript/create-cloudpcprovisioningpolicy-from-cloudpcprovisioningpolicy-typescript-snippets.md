---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new CloudPcProvisioningPolicy()
requestBody.displayName = "Display Name value";
requestBody.description = "Description value";
requestBody.onPremisesConnectionId = "6bf90392-5fea-459a-9e9d-a2484abbffff";
requestBody.imageId = "Image ID value";
requestBody.imageDisplayName = "Image Display Name value";
requestBody.imageType = "gallery";
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.cloudPcProvisioningPolicy"];
	]);
const result = async () => {
	await graphServiceClient.deviceManagement.virtualEndpoint.provisioningPolicies.post(requestBody);
}


```