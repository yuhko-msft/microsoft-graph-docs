---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessReviewPolicy()
requestBody.isGroupOwnerManagementEnabled = true;
async () => {
	await graphServiceClient.policies.accessReviewPolicy.patch(requestBody);
}


```