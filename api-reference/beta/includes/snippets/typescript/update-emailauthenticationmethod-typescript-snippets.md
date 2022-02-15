---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map([
		["emailAddress", "kim@contoso.com"];
	]);
async () => {
	await graphServiceClient.usersById("user-id").authentication.emailMethodsById("emailAuthenticationMethod-id").put(requestBody);
}


```