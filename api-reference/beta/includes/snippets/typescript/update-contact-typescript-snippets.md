---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Contact()
const typedemailaddress = new TypedEmailAddress();
typedemailaddress.additionalData = new Map<string, unknown>([
					["type", "personal"],
					["name", "Pavel Bansky"],
					["address", "pavelb@adatum.onmicrosoft.com"]
				]);
const typedemailaddress1 = new TypedEmailAddress();
typedemailaddress1.additionalData = new Map<string, unknown>([
					["address", "pavelb@fabrikam.onmicrosoft.com"],
					["name", "Pavel Bansky"],
					["type", "other"],
					["otherLabel", "Volunteer work"]
				]);
requestBody.emailAddresses = [
			typedemailaddress,
			typedemailaddress1
		]
async () => {
	await graphServiceClient.me.contactsById("contact-id").patch(requestBody);
}


```