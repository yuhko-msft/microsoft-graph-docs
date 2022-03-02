---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.comment = "comment-value";
const recipient = new Recipient();
recipient.additionalData = new Map<string, unknown>([
						 ["name" , "name-value"],
						 ["address" , "address-value"],
				]);
requestBody.toRecipients = [
			recipient
		]
async () => {
	await graphServiceClient.groupsById("group-id").threadsById("conversationThread-id").postsById("post-id").forward.post(requestBody);
}


```