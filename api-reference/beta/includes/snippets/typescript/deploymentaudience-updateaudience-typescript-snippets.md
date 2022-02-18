---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.addMembers = [
			new UpdatableAsset();
requestBody.addMembers.additionalData = new Map([
					["@odata.type", "#microsoft.graph.windowsUpdates.updatableAsset"];
					["id", "String (identifier)"];
				]);
		]
	],
requestBody.removeMembers = [
			new UpdatableAsset();
requestBody.removeMembers.additionalData = new Map([
					["@odata.type", "#microsoft.graph.windowsUpdates.updatableAsset"];
					["id", "String (identifier)"];
				]);
		]
	],
requestBody.addExclusions = [
			new UpdatableAsset();
requestBody.addExclusions.additionalData = new Map([
					["@odata.type", "#microsoft.graph.windowsUpdates.updatableAsset"];
					["id", "String (identifier)"];
				]);
		]
	],
requestBody.removeExclusions = [
			new UpdatableAsset();
requestBody.removeExclusions.additionalData = new Map([
					["@odata.type", "#microsoft.graph.windowsUpdates.updatableAsset"];
					["id", "String (identifier)"];
				]);
		]
	],
async () => {
	await graphServiceClient.admin.windows.updates.deploymentsById("deployment-id").audience.updateAudience.post(requestBody);
}


```