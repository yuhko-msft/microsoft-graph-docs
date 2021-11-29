---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	filter : "isElevated%20eq%20true",
};
const result = async () => {
	await graphServiceClient.privilegedRoleAssignments.get(requestParameters);
}


```