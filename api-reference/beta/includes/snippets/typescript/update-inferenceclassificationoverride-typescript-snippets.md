---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new InferenceClassificationOverride()
requestBody.classifyAs = "focused";
async () => {
	await graphServiceClient.me.inferenceClassification.overridesById("inferenceClassificationOverride-id").patch(requestBody);
}


```