---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.message = new Message();
requestBody.message.toRecipients = [
				new Recipient();
requestBody.message.toRecipients.additionalData = new Map([
							 ["address" , "samanthab@contoso.onmicrosoft.com"],
							 ["name" , "Samantha Booth"],
					]);
				new Recipient();
requestBody.message.toRecipients.additionalData = new Map([
							 ["address" , "randiw@contoso.onmicrosoft.com"],
							 ["name" , "Randi Welch"],
					]);
			]
		],
requestBody.comment = "Samantha, Randi, would you name the group please?";
async () => {
	await graphServiceClient.me.messagesById("message-id").reply.post(requestBody);
}


```