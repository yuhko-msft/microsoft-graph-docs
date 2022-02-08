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
					["skuId", "skuId-value-1"];
				]);
			new AssignedLicense();
requestBody.addLicenses.additionalData = new Map([
					["disabledPlans", [
							"a571ebcc-fqe0-4ca2-8c8c-7a284fd6c235";
						]
					],
					["skuId", "skuId-value-2"];
				]);
		]
	],
requestBody.removeLicenses = [
		]
	],
const result = async () => {
	await graphServiceClient.me.assignLicense.post(requestBody);
}


```