---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Contact()
requestBody.givenName = "Pavel";
requestBody.surname = "Bansky";
requestBody.emailAddresses = [
			new TypedEmailAddress();
requestBody.emailAddresses.additionalData = new Map([
					["address", "pavelb@contoso.onmicrosoft.com"];
					["name", "Pavel Bansky"];
					["type", "personal"];
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
requestBody.phones = [
			new Phone();
requestBody.phones.additionalData = new Map([
					["number", "+1 732 555 0102"];
					["type", "business"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.me.contacts.post(requestBody);
}


```