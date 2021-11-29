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
					["name", "changedLabel"];
					["languageTag", "en-US"];
					["isDefault", true];
				]);
		]
	],
async () => {
	await graphServiceClient.sitesById("site-id").termStore.setsById("set-id").termsById("term-id").patch(requestBody);
}


```