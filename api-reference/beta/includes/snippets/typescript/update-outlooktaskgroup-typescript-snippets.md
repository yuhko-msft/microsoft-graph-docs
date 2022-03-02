---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new OutlookTaskGroup()
requestBody.name = "Personal Tasks";
async () => {
	await graphServiceClient.me.outlook.taskGroupsById("outlookTaskGroup-id").patch(requestBody);
}


```