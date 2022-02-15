---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Permission()
requestBody.roles = [
			"write";
		]
	],
requestBody.grantedToIdentities = [
			new IdentitySet();
requestBody.grantedToIdentities.additionalData = new Map([
						 ["id" , "89ea5c94-7736-4e25-95ad-3fa95f62b66e"],
						 ["displayName" , "Contoso Time Manager App"],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.sitesById("site-id").permissions.post(requestBody);
}


```