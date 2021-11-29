---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ProfileCardProperty()
requestBody.annotations = [
			new ProfileCardAnnotation();
requestBody.annotations.additionalData = new Map([
					["localizations", [
								 ["languageTag" , "no-NB"],
								 ["displayName" , "Kostnads Senter"],
						]
					],
				]);
		]
	],
async () => {
	await graphServiceClient.organizationById("organization-id").settings.profileCardPropertiesById("profileCardProperty-id").patch(requestBody);
}


```