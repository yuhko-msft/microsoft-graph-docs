---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new OAuth2PermissionGrant()
requestBody.scope = "scope-value";
async () => {
	await graphServiceClient.oauth2PermissionGrantsById("oAuth2PermissionGrant-id").patch(requestBody);
}


```