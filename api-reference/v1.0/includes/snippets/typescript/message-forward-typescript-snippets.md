---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.comment = "comment-value";
requestBody.toRecipients = [
			new Recipient();
requestBody.toRecipients.additionalData = new Map([
						 ["name" , "name-value"],
						 ["address" , "address-value"],
				]);
		]
	],
async () => {
	await graphServiceClient.me.messagesById("message-id").forward.post(requestBody);
}


```