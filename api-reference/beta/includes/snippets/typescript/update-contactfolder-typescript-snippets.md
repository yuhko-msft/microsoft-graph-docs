---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ContactFolder()
requestBody.parentFolderId = "parentFolderId-value";
requestBody.displayName = "displayName-value";
async () => {
	await graphServiceClient.me.contactFoldersById("contactFolder-id").patch(requestBody);
}


```