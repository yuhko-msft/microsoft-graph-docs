---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.toRecipients = [
			new Recipient();
requestBody.toRecipients.additionalData = new Map([
						 ["address" , "danas@contoso.onmicrosoft.com"],
						 ["name" , "Dana Swope"],
				]);
		]
	],
requestBody.comment = "Dana, hope you can make this meeting.";
async () => {
	await graphServiceClient.me.eventsById("event-id").forward.post(requestBody);
}


```