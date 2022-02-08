---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ThreatAssessmentRequest()
requestBody.expectedAssessment = "block";
requestBody.category = "phishing";
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.urlAssessmentRequest"];
		["url", "http://test.com"];
	]);
const result = async () => {
	await graphServiceClient.informationProtection.threatAssessmentRequests.post(requestBody);
}


```