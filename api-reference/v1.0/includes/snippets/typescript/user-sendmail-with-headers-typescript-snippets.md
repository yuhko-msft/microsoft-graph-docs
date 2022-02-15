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
requestBody.message.toRecipients = [
				new Recipient();
requestBody.message.toRecipients.additionalData = new Map([
							 ["address" , "AlexW@contoso.OnMicrosoft.com"],
					]);
			]
		],
requestBody.message.internetMessageHeaders = [
				new InternetMessageHeader();
requestBody.message.internetMessageHeaders.additionalData = new Map([
						["name", "x-custom-header-group-name"];
						["value", "Nevada"];
					]);
				new InternetMessageHeader();
requestBody.message.internetMessageHeaders.additionalData = new Map([
						["name", "x-custom-header-group-id"];
						["value", "NV001"];
					]);
			]
		],
async () => {
	await graphServiceClient.me.sendMail.post(requestBody);
}


```