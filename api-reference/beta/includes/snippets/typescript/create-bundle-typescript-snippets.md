---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new DriveItem()
requestBody.name = "Just some files";
requestBody.bundle = new Bundle();
requestBody.children = [
			new DriveItem();
requestBody.children.additionalData = new Map([
					["id", "1234asdf"];
				]);
			new DriveItem();
requestBody.children.additionalData = new Map([
					["id", "1234qwerty"];
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