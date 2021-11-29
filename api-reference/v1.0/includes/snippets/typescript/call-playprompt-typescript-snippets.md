---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.clientContext = "d45324c1-fcb5-430a-902c-f20af696537c";
requestBody.prompts = [
			new Prompt();
requestBody.prompts.additionalData = new Map([
					["@odata.type", "#microsoft.graph.mediaPrompt"];
						 ["@odata.type" , "#microsoft.graph.mediaInfo"],
						 ["uri" , "https://cdn.contoso.com/beep.wav"],
						 ["resourceId" , "1D6DE2D4-CD51-4309-8DAA-70768651088E"],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.communications.callsById("call-id").playPrompt.post(requestBody);
}


```