---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new UserInsightsSettings()
requestBody.isEnabled = "false";
async () => {
	await graphServiceClient.usersById("user-id").settings.itemInsights.patch(requestBody);
}


```