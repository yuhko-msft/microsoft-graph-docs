---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessPackageAssignmentRequest()
requestBody.requestType = "AdminRemove";
requestBody.assignment = new AccessPackageAssignment();
requestBody.assignment.id = "a6bb6942-3ae1-4259-9908-0133aaee9377";
const result = async () => {
	await graphServiceClient.identityGovernance.entitlementManagement.assignmentRequests.post(requestBody);
}


```