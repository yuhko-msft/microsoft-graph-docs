---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Message()
requestBody.subject = "Did you see last night's game?";
requestBody.importance = "Low";
requestBody.body = new ItemBody();
requestBody.body.contentType = "HTML";
requestBody.body.content = "They were <b>awesome</b>!";
requestBody.toRecipients = [
			new Recipient();
requestBody.toRecipients.additionalData = new Map([
						 ["address" , "AdeleV@contoso.onmicrosoft.com"],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.me.messages.post(requestBody);
}


```