---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PrintTask()
requestBody.status = new PrintTaskStatus();
requestBody.status.state = "completed";
requestBody.status.description = "completed";
async () => {
	await graphServiceClient.print.taskDefinitionsById("printTaskDefinition-id").tasksById("printTask-id").patch(requestBody);
}


```