---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ChatMessage()
requestBody.body = new ItemBody();
requestBody.body.contentType = "html";
requestBody.body.content = "<div><div><at id="0">General</at>&nbsp;Hello there!</div></div>";
requestBody.mentions = [
			new ChatMessageMention();
requestBody.mentions.additionalData = new Map([
					["id", 0];
					["mentionText", "General"];
							 ["id" , "19:0b50940236084d258c97b21bd01917b0@thread.skype"],
							 ["displayName" , "General"],
							 ["conversationIdentityType" , "channel"],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.teamsById("team-id").channelsById("channel-id").messages.post(requestBody);
}


```