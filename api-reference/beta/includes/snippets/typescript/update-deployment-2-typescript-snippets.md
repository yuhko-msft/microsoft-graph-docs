---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Deployment()
requestBody.settings = new DeploymentSettings();
requestBody.settings.monitoring = new MonitoringSettings();
const monitoringrule = new MonitoringRule();
monitoringrule.additionalData = new Map<string, unknown>([
							["signal", "rollback"],
							["threshold", 5],
							["action", "pauseDeployment"]
						]);
requestBody.settings.monitoring.monitoringRules = [
					monitoringrule
				]
requestBody.settings.additionalData = new Map<string, unknown>([
			["@odata.type", "microsoft.graph.windowsUpdates.windowsDeploymentSettings"]
		]);
requestBody.additionalData = new Map<string, unknown>([
		["@odata.type", "#microsoft.graph.windowsUpdates.deployment"]
	]);
async () => {
	await graphServiceClient.admin.windows.updates.deploymentsById("deployment-id").patch(requestBody);
}


```