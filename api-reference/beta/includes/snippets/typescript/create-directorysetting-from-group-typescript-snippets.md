---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new DirectorySetting()
requestBody.additionalData = new Map([
			 ["displayName" , "displayName-value"],
			 ["templateId" , "templateId-value"],
			 ["values" , [
						 ["name" , "name-value"],
						 ["value" , "value-value"],
				]
			],
	]);
const result = async () => {
	await graphServiceClient.groupsById("group-id").settings.post(requestBody);
}


```