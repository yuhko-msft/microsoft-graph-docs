---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map([
		["adDomainPassword", "AdDomainPassword value"];
	]);
async () => {
	await graphServiceClient.deviceManagement.virtualEndpoint.onPremisesConnectionsById("cloudPcOnPremisesConnection-id").updateAdDomainPassword.patch(requestBody);
}


```