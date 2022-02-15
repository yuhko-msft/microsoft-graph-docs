---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new TeamsTab()
requestBody.displayName = "My Contoso Tab - updated again";
async () => {
	await graphServiceClient.chatsById("chat-id").tabsById("teamsTab-id").patch(requestBody);
}


```