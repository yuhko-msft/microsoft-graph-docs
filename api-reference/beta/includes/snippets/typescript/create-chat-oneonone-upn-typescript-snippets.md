---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Chat()
requestBody.chatType = "oneOnOne";
requestBody.members = [
			new ConversationMember();
requestBody.members.additionalData = new Map([
					["@odata.type", "#microsoft.graph.aadUserConversationMember"];
					["roles", [
							"owner";
						]
					],
					["user@odata.bind", "https://graph.microsoft.com/beta/users('jacob@contoso.com')"];
				]);
			new ConversationMember();
requestBody.members.additionalData = new Map([
					["@odata.type", "#microsoft.graph.aadUserConversationMember"];
					["roles", [
							"owner";
						]
					],
					["user@odata.bind", "https://graph.microsoft.com/beta/users('alex@contoso.com')"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.chats.post(requestBody);
}


```