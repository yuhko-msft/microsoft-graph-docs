---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Message()
requestBody.subject = "Party planning";
requestBody.toRecipients = [
			new Recipient();
requestBody.toRecipients.additionalData = new Map([
						 ["name" , "Samantha Booth"],
						 ["address" , "samanthab@contoso.onmicrosoft.com"],
				]);
		]
	],
requestBody.mentions = [
			new Mention();
requestBody.mentions.additionalData = new Map([
						 ["name" , "Dana Swope"],
						 ["address" , "danas@contoso.onmicrosoft.com"],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.me.messages.post(requestBody);
}


```