---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Message()
requestBody.subject = "Annual review";
requestBody.body = new ItemBody();
requestBody.body.contentType = "HTML";
requestBody.body.content = "You should be proud!";
requestBody.toRecipients = [
			new Recipient();
requestBody.toRecipients.additionalData = new Map([
						 ["address" , "rufus@contoso.com"],
				]);
		]
	],
requestBody.extensions = [
			new Extension();
requestBody.extensions.additionalData = new Map([
					["@odata.type", "microsoft.graph.openTypeExtension"];
					["extensionName", "Com.Contoso.Referral"];
					["companyName", "Wingtip Toys"];
					["expirationDate", "2015-12-30T11:00:00.000Z"];
					["dealValue", 10000];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.me.messages.post(requestBody);
}


```