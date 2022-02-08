---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.topic = new TeamworkActivityTopic();
requestBody.topic.source = "entityUrl";
requestBody.topic.value = "https://graph.microsoft.com/v1.0/chats/{chatId}/messages/{messageId}";
requestBody.activityType = "approvalRequired";
requestBody.previewText = new ItemBody();
requestBody.previewText.content = "Deployment requires your approval";
requestBody.recipient = new TeamworkNotificationRecipient();
requestBody.recipient.additionalData = new Map([
			["@odata.type", "Microsoft.Teams.GraphSvc.aadUserNotificationRecipient"];
			["userId", "jacob@contoso.com"];
		]);
requestBody.templateParameters = [
			new KeyValuePair();
requestBody.templateParameters.additionalData = new Map([
					["name", "approvalTaskId"];
					["value", "2020AAGGTAPP"];
				]);
		]
	],
async () => {
	await graphServiceClient.chatsById("chat-id").sendActivityNotification.post(requestBody);
}


```