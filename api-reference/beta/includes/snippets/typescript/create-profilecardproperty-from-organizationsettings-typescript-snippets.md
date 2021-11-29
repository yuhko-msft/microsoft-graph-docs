---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ProfileCardProperty()
requestBody.directoryPropertyName = "CustomAttribute1";
requestBody.annotations = [
			new ProfileCardAnnotation();
requestBody.annotations.additionalData = new Map([
					["displayName", "Cost Center"];
					["localizations", [
								 ["languageTag" , "ru-RU"],
								 ["displayName" , "центр затрат"],
						]
					],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.organizationById("organization-id").settings.profileCardProperties.post(requestBody);
}


```