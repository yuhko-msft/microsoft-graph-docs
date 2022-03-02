---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	expand : "children",
};
const result = async () => {
	await graphServiceClient.sharesById("sharedDriveItem-id").driveItem.get(requestParameters);
}


```