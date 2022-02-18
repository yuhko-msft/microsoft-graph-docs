---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PersonAnnualEvent()
requestBody.allowedAudiences = "contacts";
async () => {
	await graphServiceClient.me.profile.anniversariesById("personAnnualEvent-id").patch(requestBody);
}


```