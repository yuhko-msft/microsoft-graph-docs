---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	format : "%7Bformat%7D",
};
async () => {
	await graphServiceClient.drive.itemsById("driveItem-id").content.get(requestParameters);
}


```