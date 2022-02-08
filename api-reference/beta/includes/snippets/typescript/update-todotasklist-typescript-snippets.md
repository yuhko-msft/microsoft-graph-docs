---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new TodoTaskList()
requestBody.displayName = "Vacation Plan";
async () => {
	await graphServiceClient.me.todo.listsById("todoTaskList-id").patch(requestBody);
}


```