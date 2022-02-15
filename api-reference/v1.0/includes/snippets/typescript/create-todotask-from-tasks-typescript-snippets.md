---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new TodoTask()
requestBody.title = "A new task";
requestBody.linkedResources = [
			new LinkedResource();
requestBody.linkedResources.additionalData = new Map([
					["webUrl", "http://microsoft.com"];
					["applicationName", "Microsoft"];
					["displayName", "Microsoft"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.me.todo.listsById("todoTaskList-id").tasks.post(requestBody);
}


```