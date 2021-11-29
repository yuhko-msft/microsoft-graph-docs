---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new LanguageProficiency()
requestBody.allowedAudiences = "organization";
async () => {
	await graphServiceClient.me.profile.languagesById("languageProficiency-id").patch(requestBody);
}


```