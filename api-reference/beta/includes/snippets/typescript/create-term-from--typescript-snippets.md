---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Term()
requestBody.labels = [
			new LocalizedLabel();
requestBody.labels.additionalData = new Map([
					["languageTag", "en-US"];
					["name", "Car"];
					["isDefault", true];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.termStore.setsById("set-id").children.post(requestBody);
}


```