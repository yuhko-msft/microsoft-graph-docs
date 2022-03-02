---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Deployment()
requestBody.state = new DeploymentState();
requestBody.state.requestedValue = "paused";
requestBody.state.additionalData = new Map<string, unknown>([
			["@odata.type", "microsoft.graph.windowsUpdates.deploymentState"]
		]);
requestBody.additionalData = new Map<string, unknown>([
		["@odata.type", "#microsoft.graph.windowsUpdates.deployment"]
	]);
async () => {
	await graphServiceClient.admin.windows.updates.deploymentsById("deployment-id").patch(requestBody);
}


```