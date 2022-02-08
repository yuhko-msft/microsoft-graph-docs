---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map([
		["LocalizedStrings", [
					 ["elementType" , "UxElement"],
					 ["elementId" , null],
					 ["stringId" , "alert_message"],
					 ["override" , true],
					 ["value" , "Are you sure that you want to cancel your selection?"],
			]
		],
	]);
async () => {
	await graphServiceClient.identity.b2cUserFlowsById("b2cIdentityUserFlow-id").languagesById("userFlowLanguageConfiguration-id").overridesPagesById("userFlowLanguagePage-id").$value.put(requestBody);
}


```