---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ChatMessage()
requestBody.body = new ItemBody();
requestBody.body.contentType = "html";
requestBody.body.content = "<div><div><at id="0">TestTag</at>&nbsp;Testing Tags</div></div>";
requestBody.mentions = [
			new ChatMessageMention();
requestBody.mentions.additionalData = new Map([
					["id", 0];
					["mentionText", "TestTag"];
							 ["id" , "MjQzMmI1N2ItMGFiZC00M2RiLWFhN2ItMTZlYWRkMTE1ZDM0IyM2OGEzZTM2NS1mN2Q5LTRhNTYtYjQ5OS0yNDMzMmE5Y2M1NzIjI3RTMERJZ1Z1ZQ=="],
							 ["displayName" , "TestTag"],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.teamsById("team-id").channelsById("channel-id").messages.post(requestBody);
}


```