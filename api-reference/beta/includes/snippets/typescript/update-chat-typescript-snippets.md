---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Chat()
requestBody.topic = "Group chat title update";
async () => {
	await graphServiceClient.chatsById("chat-id").patch(requestBody);
}


```