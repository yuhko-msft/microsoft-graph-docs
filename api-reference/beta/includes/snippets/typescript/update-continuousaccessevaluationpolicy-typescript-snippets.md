---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ContinuousAccessEvaluationPolicy()
requestBody.migrate = true;
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.continuousAccessEvaluationPolicy"];
	]);
async () => {
	await graphServiceClient.identity.continuousAccessEvaluationPolicy.patch(requestBody);
}


```