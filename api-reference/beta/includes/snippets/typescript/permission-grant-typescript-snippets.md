---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.recipients = [
			new DriveRecipient();
requestBody.recipients.additionalData = new Map([
					["email", "john@contoso.com"];
				]);
			new DriveRecipient();
requestBody.recipients.additionalData = new Map([
					["email", "ryan@external.com"];
				]);
		]
	],
requestBody.roles = [
			"read";
		]
	],
const result = async () => {
	await graphServiceClient.sharesById("sharedDriveItem-id").permission.grant.post(requestBody);
}


```