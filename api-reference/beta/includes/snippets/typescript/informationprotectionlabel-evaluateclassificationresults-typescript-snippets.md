---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.contentInfo = new ContentInfo();
requestBody.contentInfo.format = "default";
requestBody.contentInfo.identifier = null,
requestBody.contentInfo.state = "rest";
requestBody.contentInfo.additionalData = new Map([
			["@odata.type", "#microsoft.graph.contentInfo"];
			["format@odata.type", "#microsoft.graph.contentFormat"];
			["state@odata.type", "#microsoft.graph.contentState"];
		]);
requestBody.classificationResults = [
			new ClassificationResult();
requestBody.classificationResults.additionalData = new Map([
					["sensitiveTypeId", "cb353f78-2b72-4c3c-8827-92ebe4f69fdf"];
					["count", 4];
					["confidenceLevel", 75];
				]);
		]
	],
const headers = {
	"User-Agent": "ContosoLOBApp/1.0",
};
const result = async () => {
	await graphServiceClient.informationProtection.policy.labels.evaluateClassificationResults.post(requestBody, headers);
}


```