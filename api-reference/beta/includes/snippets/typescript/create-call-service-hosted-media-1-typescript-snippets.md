---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Call()
requestBody.callbackUri = "https://bot.contoso.com/callback";
requestBody.targets = [
			new InvitationParticipantInfo();
requestBody.targets.additionalData = new Map([
					["@odata.type", "#microsoft.graph.invitationParticipantInfo"];
						 ["@odata.type" , "#microsoft.graph.identitySet"],
							 ["@odata.type" , "#microsoft.graph.identity"],
							 ["displayName" , "John"],
							 ["id" , "112f7296-5fa4-42ca-bae8-6a692b15d4b8"],
				]);
		]
	],
requestBody.requestedModalities = [
			"audio";
		]
	],
requestBody.mediaConfig = new MediaConfig();
requestBody.mediaConfig.additionalData = new Map([
			["@odata.type", "#microsoft.graph.serviceHostedMediaConfig"];
		]);
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.call"];
	]);
const result = async () => {
	await graphServiceClient.communications.calls.post(requestBody);
}


```