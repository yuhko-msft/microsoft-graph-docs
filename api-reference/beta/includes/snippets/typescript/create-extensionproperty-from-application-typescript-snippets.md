---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ExtensionProperty()
requestBody.name = "extensionName";
requestBody.dataType = "string";
requestBody.targetObjects = [
			"Application";
		]
	],
const result = async () => {
	await graphServiceClient.applicationsById("application-id").extensionProperties.post(requestBody);
}


```