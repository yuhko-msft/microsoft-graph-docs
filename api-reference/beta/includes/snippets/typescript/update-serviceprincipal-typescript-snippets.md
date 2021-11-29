---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ServicePrincipal()
requestBody.appRoleAssignmentRequired = true;
async () => {
	await graphServiceClient.servicePrincipalsById("servicePrincipal-id").patch(requestBody);
}


```