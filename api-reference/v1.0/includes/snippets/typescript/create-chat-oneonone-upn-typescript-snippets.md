---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Chat()
requestBody.chatType = "oneOnOne";
const conversationmember = new ConversationMember();
conversationmember.additionalData = new Map<string, unknown>([
					["@odata.type", "#microsoft.graph.aadUserConversationMember"],
					["roles", [
							"owner"
						]
					["user@odata.bind", "https://graph.microsoft.com/v1.0/users('jacob@contoso.com')"]
				]);
const conversationmember1 = new ConversationMember();
conversationmember1.additionalData = new Map<string, unknown>([
					["@odata.type", "#microsoft.graph.aadUserConversationMember"],
					["roles", [
							"owner"
						]
					["user@odata.bind", "https://graph.microsoft.com/v1.0/users('alex@contoso.com')"]
				]);
requestBody.members = [
			conversationmember,
			conversationmember1
		]
const result = async () => {
	await graphServiceClient.chats.post(requestBody);
}


```