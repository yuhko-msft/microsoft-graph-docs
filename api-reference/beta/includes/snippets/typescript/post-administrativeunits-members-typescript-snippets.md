---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map([
		["@odata.type", "#Microsoft.Graph.Group"];
		["description", "Self help community for golf"];
		["displayName", "Golf Assist"];
		["groupTypes", [
				"Unified";
			]
		],
		["mailEnabled", true];
		["mailNickname", "golfassist"];
		["securityEnabled", false];
	]);
async () => {
	await graphServiceClient.administrativeUnitsById("administrativeUnit-id").members.post(requestBody);
}


```