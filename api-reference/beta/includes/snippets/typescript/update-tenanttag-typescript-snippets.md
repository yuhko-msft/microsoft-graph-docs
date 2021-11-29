---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new TenantTag()
requestBody.displayName = "Onboarding";
requestBody.description = "Tenants that we are currently onboarding";
async () => {
	await graphServiceClient.tenantRelationships.managedTenants.tenantTagsById("tenantTag-id").patch(requestBody);
}


```