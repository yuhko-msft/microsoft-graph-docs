---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
const conversationmember = new ConversationMember();
conversationmember.additionalData = new Map<string, unknown>([
					["@odata.type", "microsoft.graph.aadUserConversationMember"],
					["roles", [
						]
					["user@odata.bind", "https://graph.microsoft.com/beta/users('jacob@contoso.com')"]
				]);
const conversationmember1 = new ConversationMember();
conversationmember1.additionalData = new Map<string, unknown>([
					["@odata.type", "microsoft.graph.aadUserConversationMember"],
					["roles", [
							"owner"
						]
					["user@odata.bind", "https://graph.microsoft.com/beta/users('alex@contoso.com')"]
				]);
requestBody.values = [
			conversationmember,
			conversationmember1
		]
const result = async () => {
	await graphServiceClient.teamsById("team-id").members.add.post(requestBody);
}


```