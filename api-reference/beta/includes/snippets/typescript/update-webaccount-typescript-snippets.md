---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new WebAccount()
requestBody.webUrl = "https://github.com/innocenty.popov";
async () => {
	await graphServiceClient.me.profile.webAccountsById("webAccount-id").patch(requestBody);
}


```