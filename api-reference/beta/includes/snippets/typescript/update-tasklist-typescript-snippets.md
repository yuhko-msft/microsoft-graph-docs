---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new BaseTaskList()
requestBody.displayName = "Travel Plan";
async () => {
	await graphServiceClient.me.tasks.listsById("baseTaskList-id").patch(requestBody);
}


```