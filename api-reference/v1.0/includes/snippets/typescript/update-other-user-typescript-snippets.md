---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new User()
requestBody.businessPhones = [
			"+1 425 555 0109";
		]
	],
requestBody.officeLocation = "18/2111";
async () => {
	await graphServiceClient.usersById("user-id").patch(requestBody);
}


```