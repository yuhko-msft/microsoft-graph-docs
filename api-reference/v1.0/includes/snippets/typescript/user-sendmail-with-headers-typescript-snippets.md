---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.message = new Message();
requestBody.message.subject = "9/9/2018: concert";
requestBody.message.body = new ItemBody();
requestBody.message.body.contentType = "HTML";
requestBody.message.body.content = "The group represents Nevada.";
const recipient = new Recipient();
recipient.additionalData = new Map<string, unknown>([
							 ["address" , "AlexW@contoso.OnMicrosoft.com"],
					]);
requestBody.message.toRecipients = [
				recipient
			]
const internetmessageheader = new InternetMessageHeader();
internetmessageheader.additionalData = new Map<string, unknown>([
						["name", "x-custom-header-group-name"],
						["value", "Nevada"]
					]);
const internetmessageheader1 = new InternetMessageHeader();
internetmessageheader1.additionalData = new Map<string, unknown>([
						["name", "x-custom-header-group-id"],
						["value", "NV001"]
					]);
requestBody.message.internetMessageHeaders = [
				internetmessageheader,
				internetmessageheader1
			]
async () => {
	await graphServiceClient.me.sendMail.post(requestBody);
}


```