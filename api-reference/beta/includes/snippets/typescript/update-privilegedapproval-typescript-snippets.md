---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PrivilegedApproval()
requestBody.approvalState = "approvalState-value";
requestBody.approverReason = "approverReason-value";
async () => {
	await graphServiceClient.privilegedApprovalById("privilegedApproval-id").patch(requestBody);
}


```