---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new LanguageProficiency()
requestBody.displayName = "Norwegian Bokmål";
requestBody.tag = "nb-NO";
requestBody.spoken = "nativeOrBilingual";
requestBody.written = "nativeOrBilingual";
requestBody.reading = "nativeOrBilingual";
const result = async () => {
	await graphServiceClient.me.profile.languages.post(requestBody);
}


```