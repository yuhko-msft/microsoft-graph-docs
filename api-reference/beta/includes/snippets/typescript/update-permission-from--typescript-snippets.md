---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Permission()
requestBody.roles = [
			"read";
		]
	],
async () => {
	await graphServiceClient.sitesById("site-id").permissionsById("permission-id").patch(requestBody);
}


```