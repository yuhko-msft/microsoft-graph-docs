---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.message = new Message();
requestBody.message.subject = "Project kickoff";
requestBody.message.toRecipients = [
				new Recipient();
requestBody.message.toRecipients.additionalData = new Map([
							 ["name" , "Samantha Booth"],
							 ["address" , "samanthab@contoso.onmicrosoft.com"],
					]);
			]
		],
requestBody.message.mentions = [
				new Mention();
requestBody.message.mentions.additionalData = new Map([
							 ["name" , "Dana Swope"],
							 ["address" , "danas@contoso.onmicrosoft.com"],
					]);
			]
		],
async () => {
	await graphServiceClient.me.sendMail.post(requestBody);
}


```