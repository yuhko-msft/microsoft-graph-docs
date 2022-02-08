---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new UserAccountInformation()
requestBody.countryCode = "NO";
async () => {
	await graphServiceClient.me.profile.accountById("userAccountInformation-id").patch(requestBody);
}


```