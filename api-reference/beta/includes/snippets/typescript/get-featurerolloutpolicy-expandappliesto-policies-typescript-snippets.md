---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	expand : "appliesTo",
};
const result = async () => {
	await graphServiceClient.policies.featureRolloutPoliciesById("featureRolloutPolicy-id").get(requestParameters);
}


```