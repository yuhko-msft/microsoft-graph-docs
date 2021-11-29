---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.securityEnabledOnly = true;
const result = async () => {
	await graphServiceClient.contactsById("orgContact-id").getMemberObjects.post(requestBody);
}


```