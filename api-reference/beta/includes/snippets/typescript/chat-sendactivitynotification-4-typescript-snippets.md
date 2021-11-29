---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.topic = new TeamworkActivityTopic();
requestBody.topic.source = "entityUrl";
requestBody.topic.value = "https://graph.microsoft.com/beta/chats/19:1c3af46e9e0f4a5293343c8813c47619@thread.v2";
requestBody.activityType = "taskCreated";
requestBody.previewText = new ItemBody();
requestBody.previewText.content = "New Task Created";
requestBody.recipient = new TeamworkNotificationRecipient();
requestBody.recipient.additionalData = new Map([
			["@odata.type", "microsoft.graph.chatMembersNotificationRecipient"];
			["chatId", "19:1c3af46e9e0f4a5293343c8813c47619@thread.v2"];
		]);
requestBody.templateParameters = [
			new KeyValuePair();
requestBody.templateParameters.additionalData = new Map([
					["name", "taskId"];
					["value", "Task 12322"];
				]);
		]
	],
async () => {
	await graphServiceClient.chatsById("chat-id").sendActivityNotification.post(requestBody);
}


```