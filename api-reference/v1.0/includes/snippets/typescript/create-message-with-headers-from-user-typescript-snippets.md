---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Message()
requestBody.subject = "9/8/2018: concert";
requestBody.body = new ItemBody();
requestBody.body.contentType = "HTML";
requestBody.body.content = "The group represents Washington.";
requestBody.toRecipients = [
			new Recipient();
requestBody.toRecipients.additionalData = new Map([
						 ["address" , "AlexW@contoso.OnMicrosoft.com"],
				]);
		]
	],
requestBody.internetMessageHeaders = [
			new InternetMessageHeader();
requestBody.internetMessageHeaders.additionalData = new Map([
					["name", "x-custom-header-group-name"];
					["value", "Washington"];
				]);
			new InternetMessageHeader();
requestBody.internetMessageHeaders.additionalData = new Map([
					["name", "x-custom-header-group-id"];
					["value", "WA001"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.me.messages.post(requestBody);
}


```