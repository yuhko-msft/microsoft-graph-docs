---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Deployment()
requestBody.content = new DeployableContent();
requestBody.content.additionalData = new Map([
			["@odata.type", "microsoft.graph.windowsUpdates.featureUpdateReference"];
			["version", "20H2"];
		]);
requestBody.settings = new DeploymentSettings();
requestBody.settings.rollout = new RolloutSettings();
requestBody.settings.rollout.devicesPerOffer = 100;
requestBody.settings.monitoring = new MonitoringSettings();
requestBody.settings.monitoring.monitoringRules = [
					new MonitoringRule();
requestBody.settings.monitoring.monitoringRules.additionalData = new Map([
							["@odata.type", "#microsoft.graph.windowsUpdates.monitoringRule"];
							["signal", "rollback"];
							["threshold", 5];
							["action", "pauseDeployment"];
						]);
				]
			],
requestBody.settings.additionalData = new Map([
			["@odata.type", "microsoft.graph.windowsUpdates.windowsDeploymentSettings"];
		]);
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.windowsUpdates.deployment"];
	]);
const result = async () => {
	await graphServiceClient.admin.windows.updates.deployments.post(requestBody);
}


```