---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Call()
requestBody.callbackUri = "https://bot.contoso.com/callback";
requestBody.requestedModalities = [
			"audio";
		]
	],
requestBody.mediaConfig = new MediaConfig();
requestBody.mediaConfig.additionalData = new Map([
			["@odata.type", "#microsoft.graph.serviceHostedMediaConfig"];
			["preFetchMedia", [
						 ["uri" , "https://cdn.contoso.com/beep.wav"],
						 ["resourceId" , "f8971b04-b53e-418c-9222-c82ce681a582"],
						 ["uri" , "https://cdn.contoso.com/cool.wav"],
						 ["resourceId" , "86dc814b-c172-4428-9112-60f8ecae1edb"],
				]
			],
		]);
requestBody.chatInfo = new ChatInfo();
requestBody.chatInfo.threadId = "19:meeting_Win6Ydo4wsMijFjZS00ZGVjLTk5MGUtOTRjNWY2NmNkYTFm@thread.v2";
requestBody.chatInfo.messageId = "0";
requestBody.chatInfo.additionalData = new Map([
			["@odata.type", "#microsoft.graph.chatInfo"];
		]);
requestBody.meetingInfo = new MeetingInfo();
requestBody.meetingInfo.allowConversationWithoutHost = true;
requestBody.meetingInfo.additionalData = new Map([
			["@odata.type", "#microsoft.graph.organizerMeetingInfo"];
				 ["@odata.type" , "#microsoft.graph.identitySet"],
					 ["@odata.type" , "#microsoft.graph.identity"],
					 ["id" , "5810cede-f3cc-42eb-b2c1-e9bd5d53ec96"],
					 ["tenantId" , "9f386a15-f9cc-445b-8106-ac85e314a07b"],
					 ["displayName" , "Bob"],
		]);
requestBody.tenantId = "86dc81db-c112-4228-9222-63f3esaa1edb";
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.call"];
	]);
const result = async () => {
	await graphServiceClient.communications.calls.post(requestBody);
}


```