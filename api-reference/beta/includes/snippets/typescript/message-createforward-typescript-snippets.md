---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.message = new Message();
requestBody.message.additionalData = new Map([
			["isDeliveryReceiptRequested", true];
			["toRecipients", [
							 ["address" , "danas@contoso.onmicrosoft.com"],
							 ["name" , "Dana Swope"],
				]
			],
		]);
requestBody.comment = "Dana, just want to make sure you get this; you'll need this if the project gets approved.";
const result = async () => {
	await graphServiceClient.me.messagesById("message-id").createForward.post(requestBody);
}


```