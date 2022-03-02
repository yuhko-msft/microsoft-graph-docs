---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new DriveItem()
requestBody.name = "Just some files";
requestBody.bundle = new Bundle();
const driveitem = new DriveItem();
driveitem.additionalData = new Map<string, unknown>([
					["id", "1234asdf"]
				]);
const driveitem1 = new DriveItem();
driveitem1.additionalData = new Map<string, unknown>([
					["id", "1234qwerty"]
				]);
requestBody.children = [
			driveitem,
			driveitem1
		]
requestBody.additionalData = new Map<string, unknown>([
		["@microsoft.graph.conflictBehavior", "rename"]
	]);
const result = async () => {
	await graphServiceClient.drive.bundles.post(requestBody);
}


```