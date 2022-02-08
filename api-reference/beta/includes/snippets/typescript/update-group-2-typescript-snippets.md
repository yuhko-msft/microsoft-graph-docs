---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Group()
requestBody.assignedLabels = [
			new AssignedLabel();
requestBody.assignedLabels.additionalData = new Map([
					["labelId", "45cd0c48-c540-4358-ad79-a3658cdc5b88"];
				]);
		]
	],
async () => {
	await graphServiceClient.groupsById("group-id").patch(requestBody);
}


```