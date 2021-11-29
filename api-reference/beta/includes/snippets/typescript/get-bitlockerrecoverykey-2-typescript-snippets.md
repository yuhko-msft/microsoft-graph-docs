---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const headers = {
	"ocp-client-name": "\"My Friendly Client\"",
	"ocp-client-version": "\"1.2\"",
};
let requestParameters = {
	filter : "deviceId%20eq%20'1ab40ab2-32a8-4b00-b6b5-ba724e407de9'",
};
const result = async () => {
	await graphServiceClient.informationProtection.bitlocker.recoveryKeys.get(requestParameters, headers);
}


```