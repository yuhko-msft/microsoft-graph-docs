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
							 ["address" , "meganb@contoso.onmicrosoft.com"],
					]);
			]
		],
requestBody.message.attachments = [
				new Attachment();
requestBody.message.attachments.additionalData = new Map([
						["@odata.type", "#microsoft.graph.fileAttachment"];
						["name", "attachment.txt"];
						["contentType", "text/plain"];
						["contentBytes", "SGVsbG8gV29ybGQh"];
					]);
			]
		],
async () => {
	await graphServiceClient.me.sendMail.post(requestBody);
}


```