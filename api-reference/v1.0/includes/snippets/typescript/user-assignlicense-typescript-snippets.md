---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.addLicenses = [
			new AssignedLicense();
requestBody.addLicenses.additionalData = new Map([
					["disabledPlans", [
							"11b0131d-43c8-4bbb-b2c8-e80f9a50834a";
						]
					],
					["skuId", "guid"];
				]);
		]
	],
requestBody.removeLicenses = [
			"bea13e0c-3828-4daa-a392-28af7ff61a0f";
		]
	],
const result = async () => {
	await graphServiceClient.me.assignLicense.post(requestBody);
}


```