---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
const updatableasset = new UpdatableAsset();
updatableasset.additionalData = new Map<string, unknown>([
					["@odata.type", "#microsoft.graph.windowsUpdates.azureADDevice"],
					["id", "String (identifier)"]
				]);
requestBody.assets = [
			updatableasset
		]
async () => {
	await graphServiceClient.admin.windows.updates.updatableAssetsById("updatableAsset-id").addMembers.post(requestBody);
}


```