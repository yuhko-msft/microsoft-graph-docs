---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new DriveItem()
requestBody.name = "Shared legal agreements";
async () => {
	await graphServiceClient.drive.itemsById("driveItem-id").patch(requestBody);
}


```