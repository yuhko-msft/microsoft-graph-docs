---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ClaimsMappingPolicy()
requestBody.displayName = "UpdateClaimsPolicy";
async () => {
	await graphServiceClient.policies.claimsMappingPoliciesById("claimsMappingPolicy-id").patch(requestBody);
}


```