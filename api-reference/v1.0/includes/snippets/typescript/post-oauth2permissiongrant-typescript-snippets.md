---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new OAuth2PermissionGrant()
requestBody.clientId = "clientId-value";
requestBody.consentType = "consentType-value";
requestBody.principalId = "principalId-value";
requestBody.resourceId = "resourceId-value";
requestBody.scope = "scope-value";
const result = async () => {
	await graphServiceClient.oauth2PermissionGrants.post(requestBody);
}


```