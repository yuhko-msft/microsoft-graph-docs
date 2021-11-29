---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new TenantCustomizedInformation()
requestBody.tenantId = "String";
requestBody.contacts = [
			new TenantContactInformation();
requestBody.contacts.additionalData = new Map([
					["@odata.type", "microsoft.graph.managedTenants.tenantContactInformation"];
				]);
		]
	],
requestBody.website = "String";
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.managedTenants.tenantCustomizedInformation"];
	]);
async () => {
	await graphServiceClient.tenantRelationships.managedTenants.tenantsCustomizedInformationById("tenantCustomizedInformation-id").patch(requestBody);
}


```