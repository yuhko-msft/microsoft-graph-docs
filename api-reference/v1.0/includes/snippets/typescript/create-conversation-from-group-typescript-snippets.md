---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Conversation()
requestBody.topic = "Take your wellness days and rest";
requestBody.threads = [
			new ConversationThread();
requestBody.threads.additionalData = new Map([
					["posts", [
									 ["contentType" , "html"],
									 ["content" , "Contoso cares about you: Rest and Recharge"],
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