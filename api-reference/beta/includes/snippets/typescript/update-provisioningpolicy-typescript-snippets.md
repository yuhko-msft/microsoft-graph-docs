---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new CloudPcProvisioningPolicy()
requestBody.displayName = "HR provisioning policy";
requestBody.description = "Provisioning policy for India HR employees";
requestBody.onPremisesConnectionId = "4e47d0f6-6f77-44f0-8893-c0fe1701b553";
async () => {
	await graphServiceClient.deviceManagement.virtualEndpoint.provisioningPoliciesById("cloudPcProvisioningPolicy-id").patch(requestBody);
}


```