---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map([
		["clientContext", "d45324c1-fcb5-430a-902c-f20af696537c"];
		["participantMixerLevels", [
					 ["participant" , "550fae72-d251-43ec-868c-373732c2704f"],
					 ["exclusive" , true],
						 ["rampActive" , 50],
						 ["rampInactive" , 50],
						 ["lowerLevel" , 10],
						 ["upperLevel" , 50],
					 ["sourceLevels" , [
								 ["participant" , "632899f8-2ea1-4604-8413-27bd2892079f"],
								 ["level" , 50],
								 ["duckOthers" , false],
						]
					],
			]
		],
	]);
async () => {
	await graphServiceClient.communications.callsById("call-id").participantsById("participant-id").post(requestBody);
}


```