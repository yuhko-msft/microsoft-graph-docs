---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new CloudPcOrganizationSettings()
requestBody.userAccountType = "standardUser";
requestBody.osVersion = "windows11";
requestBody.additionalData = new Map<string, unknown>([
		["@odata.type", "#microsoft.graph.cloudPcOrganizationSettings"]
	]);
async () => {
	await graphServiceClient.deviceManagement.virtualEndpoint.organizationSettings.patch(requestBody);
}


```