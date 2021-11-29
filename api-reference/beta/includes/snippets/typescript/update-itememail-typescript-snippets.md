---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ItemEmail()
requestBody.displayName = "Business Email";
requestBody.type = "work";
async () => {
	await graphServiceClient.usersById("user-id").profile.emailsById("itemEmail-id").patch(requestBody);
}


```