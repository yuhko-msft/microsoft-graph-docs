---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Domain()
requestBody.isDefault = true;
requestBody.supportedServices = [
			"Email";
			"OfficeCommunicationsOnline";
		]
	],
async () => {
	await graphServiceClient.domainsById("domain-id").patch(requestBody);
}


```