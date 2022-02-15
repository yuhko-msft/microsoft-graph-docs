---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.assets = [
			new UpdatableAsset();
requestBody.assets.additionalData = new Map([
					["@odata.type", "#microsoft.graph.windowsUpdates.azureADDevice"];
					["id", "String (identifier)"];
				]);
		]
	],
async () => {
	await graphServiceClient.admin.windows.updates.updatableAssetsById("updatableAsset-id").addMembers.post(requestBody);
}


```