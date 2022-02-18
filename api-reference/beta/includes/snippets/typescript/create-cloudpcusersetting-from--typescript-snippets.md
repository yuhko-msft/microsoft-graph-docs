---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new CloudPcUserSetting()
requestBody.displayName = "Example";
requestBody.selfServiceEnabled = false;
requestBody.localAdminEnabled = true;
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.cloudPcUserSetting"];
	]);
const result = async () => {
	await graphServiceClient.deviceManagement.virtualEndpoint.userSettings.post(requestBody);
}


```