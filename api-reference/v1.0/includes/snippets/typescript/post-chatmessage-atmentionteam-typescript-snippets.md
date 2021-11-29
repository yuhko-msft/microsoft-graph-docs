---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ChatMessage()
requestBody.body = new ItemBody();
requestBody.body.contentType = "html";
requestBody.body.content = "<div><div><at id="0">GraphTesting</at>&nbsp;Hello team</div></div>";
requestBody.mentions = [
			new ChatMessageMention();
requestBody.mentions.additionalData = new Map([
					["id", 0];
					["mentionText", "GraphTesting"];
							 ["id" , "68a3e365-f7d9-4a56-b499-24332a9cc572"],
							 ["displayName" , "GraphTesting"],
							 ["conversationIdentityType" , "team"],
				]);
		]
	],
requestBody.reactions = [
		]
	],
const result = async () => {
	await graphServiceClient.teamsById("team-id").channelsById("channel-id").messages.post(requestBody);
}


```