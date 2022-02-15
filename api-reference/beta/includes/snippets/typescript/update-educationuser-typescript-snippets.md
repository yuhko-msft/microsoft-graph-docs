---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new EducationUser()
requestBody.relatedContacts = [
			new RelatedContact();
requestBody.relatedContacts.additionalData = new Map([
					["displayName", "Father Time"];
					["emailAddress", "father@time.com"];
					["mobilePhone", "4251231234"];
					["relationship", "guardian"];
					["accessConsent", true];
				]);
			new RelatedContact();
requestBody.relatedContacts.additionalData = new Map([
					["displayName", "Mother Nature"];
					["emailAddress", "mother@nature.co.uk"];
					["mobilePhone", "3251231234"];
					["relationship", "parent"];
					["accessConsent", true];
				]);
		]
	],
async () => {
	await graphServiceClient.education.usersById("educationUser-id").patch(requestBody);
}


```