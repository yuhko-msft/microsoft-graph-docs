---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new TodoTask()
requestBody.title = "A new task";
const linkedresource = new LinkedResource();
linkedresource.additionalData = new Map<string, unknown>([
					["webUrl", "http://microsoft.com"],
					["applicationName", "Microsoft"],
					["displayName", "Microsoft"]
				]);
requestBody.linkedResources = [
			linkedresource
		]
const result = async () => {
	await graphServiceClient.me.todo.listsById("todoTaskList-id").tasks.post(requestBody);
}


```