---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ConnectedOrganization()
requestBody.displayName = "Connected organization name";
requestBody.description = "Connected organization description";
requestBody.identitySources = [
			new IdentitySource();
requestBody.identitySources.additionalData = new Map([
					["@odata.type", "#microsoft.graph.domainIdentitySource"];
					["domainName", "example.com"];
					["displayName", "example.com"];
				]);
		]
	],
requestBody.state = "proposed";
const result = async () => {
	await graphServiceClient.identityGovernance.entitlementManagement.connectedOrganizations.post(requestBody);
}


```