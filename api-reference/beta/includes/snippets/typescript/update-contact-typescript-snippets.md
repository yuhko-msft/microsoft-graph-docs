---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Contact()
requestBody.emailAddresses = [
			new TypedEmailAddress();
requestBody.emailAddresses.additionalData = new Map([
					["type", "personal"];
					["name", "Pavel Bansky"];
					["address", "pavelb@adatum.onmicrosoft.com"];
				]);
			new TypedEmailAddress();
requestBody.emailAddresses.additionalData = new Map([
					["address", "pavelb@fabrikam.onmicrosoft.com"];
					["name", "Pavel Bansky"];
					["type", "other"];
					["otherLabel", "Volunteer work"];
				]);
		]
	],
async () => {
	await graphServiceClient.me.contactsById("contact-id").patch(requestBody);
}


```