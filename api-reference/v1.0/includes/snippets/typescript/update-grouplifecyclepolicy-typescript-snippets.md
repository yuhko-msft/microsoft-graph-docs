---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new GroupLifecyclePolicy()
requestBody.groupLifetimeInDays = 180;
requestBody.managedGroupTypes = "Selected";
requestBody.alternateNotificationEmails = "admin@contoso.com";
async () => {
	await graphServiceClient.groupLifecyclePoliciesById("groupLifecyclePolicy-id").patch(requestBody);
}


```