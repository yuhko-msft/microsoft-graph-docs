---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new LinkedResource()
requestBody.webUrl = "http://microsoft.com";
requestBody.applicationName = "Microsoft";
requestBody.displayName = "Microsoft";
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.linkedResource"];
	]);
async () => {
	await graphServiceClient.me.todo.listsById("todoTaskList-id").tasksById("todoTask-id").linkedResourcesById("linkedResource-id").patch(requestBody);
}


```