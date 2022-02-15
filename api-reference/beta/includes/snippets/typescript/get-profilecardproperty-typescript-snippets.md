---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const result = async () => {
	await graphServiceClient.organizationById("organization-id").settings.profileCardPropertiesById("profileCardProperty-id").get();
}


```