---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PersonCertification()
requestBody.issuingAuthority = "International Academy of Marketing Excellence";
requestBody.issuingCompany = "International Academy of Marketing Excellence";
async () => {
	await graphServiceClient.usersById("user-id").profile.certificationsById("personCertification-id").patch(requestBody);
}


```