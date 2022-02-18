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
							"8a256a2b-b617-496d-b51b-e76466e88db0";
						]
					],
					["skuId", "84a661c4-e949-4bd2-a560-ed7766fcaf2b"];
				]);
			new AssignedLicense();
requestBody.addLicenses.additionalData = new Map([
					["disabledPlans", [
						]
					],
					["skuId", "f30db892-07e9-47e9-837c-80727f46fd3d"];
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