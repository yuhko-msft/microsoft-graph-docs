---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.topic = new TeamworkActivityTopic();
requestBody.topic.source = "entityUrl";
requestBody.topic.value = "https://graph.microsoft.com/beta/teams/{teamId}/channels/{channelId}/tabs/{tabId}";
requestBody.activityType = "reservationUpdated";
requestBody.previewText = new ItemBody();
requestBody.previewText.content = "You have moved up the queue";
requestBody.recipient = new TeamworkNotificationRecipient();
requestBody.recipient.additionalData = new Map([
			["@odata.type", "Microsoft.Teams.GraphSvc.aadUserNotificationRecipient"];
			["userId", "569363e2-4e49-4661-87f2-16f245c5d66a"];
		]);
requestBody.templateParameters = [
			new KeyValuePair();
requestBody.templateParameters.additionalData = new Map([
					["name", "reservationId"];
					["value", "TREEE433"];
				]);
			new KeyValuePair();
requestBody.templateParameters.additionalData = new Map([
					["name", "currentSlot"];
					["value", "23"];
				]);
		]
	],
async () => {
	await graphServiceClient.teamsById("team-id").sendActivityNotification.post(requestBody);
}


```