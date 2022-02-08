---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new OrgContact()
requestBody.companyName = "companyName-value";
requestBody.department = "department-value";
requestBody.displayName = "displayName-value";
requestBody.additionalData = new Map([
		["businessPhones", [
				"businessPhones-value";
			]
		],
		["city", "city-value"];
		["country", "country-value"];
	]);
async () => {
	await graphServiceClient.contactsById("orgContact-id").patch(requestBody);
}


```