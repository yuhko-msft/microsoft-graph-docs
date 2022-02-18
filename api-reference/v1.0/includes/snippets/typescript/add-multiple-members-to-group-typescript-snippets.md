---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Group()
requestBody.additionalData = new Map([
		["members@odata.bind", [
				"https://graph.microsoft.com/v1.0/directoryObjects/{id}";
				"https://graph.microsoft.com/v1.0/directoryObjects/{id}";
				"https://graph.microsoft.com/v1.0/directoryObjects/{id}";
			]
		],
	]);
async () => {
	await graphServiceClient.groupsById("group-id").patch(requestBody);
}


```