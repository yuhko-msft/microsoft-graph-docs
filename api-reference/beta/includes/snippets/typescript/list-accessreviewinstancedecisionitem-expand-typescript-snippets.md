---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	expand : "instance($expand=definition)",
};
const result = async () => {
	await graphServiceClient.identityGovernance.accessReviews.decisionsById("accessReviewInstanceDecisionItem-id").get(requestParameters);
}


```