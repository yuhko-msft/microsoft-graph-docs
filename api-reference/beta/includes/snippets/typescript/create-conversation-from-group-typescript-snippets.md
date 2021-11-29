---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Conversation()
requestBody.topic = "New head count";
requestBody.threads = [
			new ConversationThread();
requestBody.threads.additionalData = new Map([
					["posts", [
									 ["contentType" , "html"],
									 ["content" , "The confirmation will come by the end of the week."],
								 ["newParticipants" , [
												 ["name" , "Adele Vance"],
												 ["address" , "AdeleV@contoso.onmicrosoft.com"],
									]
								],
						]
					],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.groupsById("group-id").conversations.post(requestBody);
}


```