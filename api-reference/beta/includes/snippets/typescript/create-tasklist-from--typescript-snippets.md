---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new BaseTaskList()
requestBody.displayName = "Shopping list";
const result = async () => {
	await graphServiceClient.me.tasks.lists.post(requestBody);
}


```