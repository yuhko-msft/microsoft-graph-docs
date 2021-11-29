---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new WorkforceIntegration()
requestBody.displayName = "displayName-value";
requestBody.apiVersion = 99;
requestBody.encryption = new WorkforceIntegrationEncryption();
requestBody.encryption.protocol = "protocol-value";
requestBody.encryption.secret = "secret-value";
requestBody.isActive = true;
requestBody.url = "url-value";
requestBody.supportedEntities = "supportedEntities-value";
async () => {
	await graphServiceClient.teamwork.workforceIntegrationsById("workforceIntegration-id").patch(requestBody);
}


```