---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PersonName()
requestBody.nickname = "Kesha";
async () => {
	await graphServiceClient.me.profile.namesById("personName-id").patch(requestBody);
}


```