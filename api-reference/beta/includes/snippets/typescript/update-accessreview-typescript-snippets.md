---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessReview()
requestBody.displayName = "TestReview new name";
async () => {
	await graphServiceClient.accessReviewsById("accessReview-id").patch(requestBody);
}


```