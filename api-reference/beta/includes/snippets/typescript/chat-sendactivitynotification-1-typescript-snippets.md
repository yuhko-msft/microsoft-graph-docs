---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.topic = new TeamworkActivityTopic();
requestBody.topic.source = "entityUrl";
requestBody.topic.value = "https://graph.microsoft.com/beta/chats/{chatId}";
requestBody.activityType = "taskCreated";
requestBody.previewText = new ItemBody();
requestBody.previewText.content = "New Task Created";
requestBody.recipient = new TeamworkNotificationRecipient();
requestBody.recipient.additionalData = new Map<string, unknown>([
			["@odata.type", "microsoft.graph.aadUserNotificationRecipient"],
			["userId", "569363e2-4e49-4661-87f2-16f245c5d66a"]
		]);
const keyvaluepair = new KeyValuePair();
keyvaluepair.additionalData = new Map<string, unknown>([
					["name", "taskId"],
					["value", "Task 12322"]
				]);
requestBody.templateParameters = [
			keyvaluepair
		]
async () => {
	await graphServiceClient.chatsById("chat-id").sendActivityNotification.post(requestBody);
}


```