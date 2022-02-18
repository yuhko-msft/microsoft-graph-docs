---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new DriveItem()
requestBody.name = "My Day at the Beach";
requestBody.bundle = new Bundle();
requestBody.bundle.album = new Album();
requestBody.children = [
			new DriveItem();
requestBody.children.additionalData = new Map([
					["id", "1234asdf"];
				]);
		]
	],
requestBody.additionalData = new Map([
		["@microsoft.graph.conflictBehavior", "rename"];
	]);
const result = async () => {
	await graphServiceClient.drive.bundles.post(requestBody);
}


```