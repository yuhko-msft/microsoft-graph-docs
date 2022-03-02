---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	expand : "roleDefinition,principal,directoryScope",
};
const result = async () => {
	await graphServiceClient.roleManagement.directory.roleAssignmentsById("unifiedRoleAssignment-id").get(requestParameters);
}


```