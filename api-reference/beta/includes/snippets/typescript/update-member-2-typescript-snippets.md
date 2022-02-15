---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ConversationMember()
requestBody.roles = [
			"owner";
		]
	],
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.aadUserConversationMember"];
	]);
async () => {
	await graphServiceClient.teamsById("team-id").membersById("conversationMember-id").patch(requestBody);
}


```