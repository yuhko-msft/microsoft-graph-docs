---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map([
		["certificateAuthorities", [
					 ["isRootAuthority" , true],
					 ["certificate" , "Binary"],
			]
		],
	]);
async () => {
	await graphServiceClient.organizationById("organization-id").certificateBasedAuthConfiguration.post(requestBody);
}


```