---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	select : "key",
};
const result = async () => {
	await graphServiceClient.informationProtection.bitlocker.recoveryKeysById("bitlockerRecoveryKey-id").get(requestParameters);
}


```