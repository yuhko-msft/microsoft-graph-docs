---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.message = new Message();
requestBody.message.subject = "Meet for lunch?";
requestBody.message.body = new ItemBody();
requestBody.message.body.contentType = "Text";
requestBody.message.body.content = "The new cafeteria is open.";
requestBody.message.toRecipients = [
				new Recipient();
requestBody.message.toRecipients.additionalData = new Map([
							 ["address" , "fannyd@contoso.onmicrosoft.com"],
					]);
			]
		],
requestBody.message.ccRecipients = [
				new Recipient();
requestBody.message.ccRecipients.additionalData = new Map([
							 ["address" , "danas@contoso.onmicrosoft.com"],
					]);
			]
		],
requestBody.saveToSentItems = "false";
async () => {
	await graphServiceClient.me.sendMail.post(requestBody);
}


```