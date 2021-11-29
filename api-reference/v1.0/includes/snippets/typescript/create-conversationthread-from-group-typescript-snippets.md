---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ConversationThread()
requestBody.topic = "New Conversation Thread Topic";
requestBody.posts = [
			new Post();
requestBody.posts.additionalData = new Map([
						 ["contentType" , "html"],
						 ["content" , "this is body content"],
					["newParticipants", [
									 ["name" , "Alex Darrow"],
									 ["address" , "alexd@contoso.com"],
						]
					],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.groupsById("group-id").threads.post(requestBody);
}


```