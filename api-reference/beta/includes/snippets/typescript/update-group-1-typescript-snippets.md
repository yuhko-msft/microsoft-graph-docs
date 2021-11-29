---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Group()
requestBody.description = "Contoso Life v2.0";
requestBody.displayName = "Contoso Life Renewed";
async () => {
	await graphServiceClient.groupsById("group-id").patch(requestBody);
}


```