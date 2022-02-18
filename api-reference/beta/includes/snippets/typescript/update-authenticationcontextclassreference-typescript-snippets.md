---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AuthenticationContextClassReference()
requestBody.additionalData = new Map([
		["value", [
					 ["displayName" , "Contoso trusted locations"],
					 ["description" , "Access is only allowed from trusted locations"],
					 ["isAvailable" , true],
			]
		],
	]);
async () => {
	await graphServiceClient.identity.conditionalAccess.authenticationContextClassReferencesById("authenticationContextClassReference-id").patch(requestBody);
}


```