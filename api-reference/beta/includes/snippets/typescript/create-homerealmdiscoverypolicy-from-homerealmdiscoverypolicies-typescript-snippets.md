---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new HomeRealmDiscoveryPolicy()
requestBody.definition = [
			"definition-value";
		]
	],
requestBody.displayName = "displayName-value";
requestBody.isOrganizationDefault = true;
const result = async () => {
	await graphServiceClient.policies.homeRealmDiscoveryPolicies.post(requestBody);
}


```