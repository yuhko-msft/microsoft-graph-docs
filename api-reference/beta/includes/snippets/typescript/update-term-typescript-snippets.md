---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Term()
const localizedlabel = new LocalizedLabel();
localizedlabel.additionalData = new Map<string, unknown>([
					["name", "changedLabel"],
					["languageTag", "en-US"],
					["isDefault", true]
				]);
requestBody.labels = [
			localizedlabel
		]
async () => {
	await graphServiceClient.termStore.setsById("set-id").termsById("term-id").patch(requestBody);
}


```