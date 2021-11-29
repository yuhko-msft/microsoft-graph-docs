---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ItemPatent()
requestBody.number = "USPTO-3954432633";
requestBody.webUrl = "https://patents.gov/3954432633";
async () => {
	await graphServiceClient.usersById("user-id").profile.patentsById("itemPatent-id").patch(requestBody);
}


```