---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new UnifiedRoleAssignmentMultiple()
requestBody.displayName = "NewName";
requestBody.description = "A new roleAssignment";
async () => {
	await graphServiceClient.roleManagement.cloudPC.roleAssignmentsById("unifiedRoleAssignmentMultiple-id").patch(requestBody);
}


```