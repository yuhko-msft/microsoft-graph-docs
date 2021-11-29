---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ConversationThread()
requestBody.topic = "Take your wellness days and rest";
requestBody.posts = [
			new Post();
requestBody.posts.additionalData = new Map([
						 ["contentType" , "html"],
						 ["content" , "Waiting for the summer holidays."],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.groupsById("group-id").conversationsById("conversation-id").threads.post(requestBody);
}


```