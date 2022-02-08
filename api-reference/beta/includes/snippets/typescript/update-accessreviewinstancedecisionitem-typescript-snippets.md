---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessReviewInstanceDecisionItem()
requestBody.decision = "Approve";
requestBody.justification = "This person is still on my team";
async () => {
	await graphServiceClient.me.pendingAccessReviewInstancesById("accessReviewInstance-id").decisionsById("accessReviewInstanceDecisionItem-id").patch(requestBody);
}


```