---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ChatMessage()
requestBody.body = new ItemBody();
requestBody.body.contentType = "html";
requestBody.body.content = "Hello World <at id="0">Jane Smith</at>";
requestBody.mentions = [
			new ChatMessageMention();
requestBody.mentions.additionalData = new Map([
					["id", 0];
					["mentionText", "Jane Smith"];
							 ["displayName" , "Jane Smith"],
							 ["id" , "ef1c916a-3135-4417-ba27-8eb7bd084193"],
							 ["userIdentityType" , "aadUser"],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.teamsById("team-id").channelsById("channel-id").messages.post(requestBody);
}


```