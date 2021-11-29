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
const result = async () => {
	await graphServiceClient.informationProtection.bitlocker.recoveryKeysById("bitlockerRecoveryKey-id").get(headers);
}


```