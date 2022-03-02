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
const driveitem = new DriveItem();
driveitem.additionalData = new Map<string, unknown>([
					["id", "1234asdf"]
				]);
requestBody.children = [
			driveitem
		]
requestBody.additionalData = new Map<string, unknown>([
		["@microsoft.graph.conflictBehavior", "rename"]
	]);
const result = async () => {
	await graphServiceClient.drive.bundles.post(requestBody);
}


```