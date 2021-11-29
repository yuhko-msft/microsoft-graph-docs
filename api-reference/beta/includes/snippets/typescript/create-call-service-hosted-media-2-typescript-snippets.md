---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Call()
requestBody.callbackUri = "https://bot.contoso.com/callback";
requestBody.source = new ParticipantInfo();
requestBody.source.identity = new IdentitySet();
requestBody.source.identity.additionalData = new Map([
				["@odata.type", "#microsoft.graph.identitySet"];
					 ["@odata.type" , "#microsoft.graph.identity"],
					 ["displayName" , "Calling Bot"],
					 ["id" , "3d913abb-aec0-4964-8fa6-3c6850c4f278"],
			]);
requestBody.source.countryCode = null,
requestBody.source.endpointType = null,
requestBody.source.region = null,
requestBody.source.languageId = null,
requestBody.source.additionalData = new Map([
			["@odata.type", "#microsoft.graph.participantInfo"];
		]);
requestBody.targets = [
			new InvitationParticipantInfo();
requestBody.targets.additionalData = new Map([
					["@odata.type", "#microsoft.graph.invitationParticipantInfo"];
						 ["@odata.type" , "#microsoft.graph.identitySet"],
							 ["@odata.type" , "#microsoft.graph.identity"],
							 ["id" , "+12345678901"],
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
requestBody.tenantId = "aa67bd4c-8475-432d-bd41-39f255720e0a";
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.call"];
	]);
const result = async () => {
	await graphServiceClient.communications.calls.post(requestBody);
}


```