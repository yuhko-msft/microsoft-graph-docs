---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new InsightsSettings()
requestBody.disabledForGroup = "edbfe4fb-ec70-4300-928f-dbb2ae86c981";
async () => {
	await graphServiceClient.organizationById("organization-id").settings.itemInsights.patch(requestBody);
}


```