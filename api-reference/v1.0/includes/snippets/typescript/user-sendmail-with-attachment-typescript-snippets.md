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
const recipient = new Recipient();
recipient.additionalData = new Map<string, unknown>([
							 ["address" , "meganb@contoso.onmicrosoft.com"],
					]);
requestBody.message.toRecipients = [
				recipient
			]
const attachment = new Attachment();
attachment.additionalData = new Map<string, unknown>([
						["@odata.type", "#microsoft.graph.fileAttachment"],
						["name", "attachment.txt"],
						["contentType", "text/plain"],
						["contentBytes", "SGVsbG8gV29ybGQh"]
					]);
requestBody.message.attachments = [
				attachment
			]
async () => {
	await graphServiceClient.me.sendMail.post(requestBody);
}


```