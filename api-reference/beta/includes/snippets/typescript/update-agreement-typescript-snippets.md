---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Agreement()
requestBody.displayName = "displayName-value";
requestBody.isViewingBeforeAcceptanceRequired = true;
async () => {
	await graphServiceClient.identityGovernance.termsOfUse.agreementsById("agreement-id").patch(requestBody);
}


```