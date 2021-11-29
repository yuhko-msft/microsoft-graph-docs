---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Group()
requestBody.description = "Library Assist";
requestBody.displayName = "Library Assist";
requestBody.groupTypes = [
			"Unified";
		]
	],
requestBody.mailEnabled = true;
requestBody.mailNickname = "library-help";
async () => {
	await graphServiceClient.groupsById("group-id").patch(requestBody);
}


```