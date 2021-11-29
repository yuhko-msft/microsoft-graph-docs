---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Program()
requestBody.displayName = "testprogram3 new name";
async () => {
	await graphServiceClient.programsById("program-id").patch(requestBody);
}


```