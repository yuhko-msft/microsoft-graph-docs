---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
const tiindicator = new TiIndicator();
tiindicator.additionalData = new Map<string, unknown>([
					["id", "c6fb948b-89c5-3bba-a2cd-a9d9a1e430e4"],
					["additionalInformation", "mytest"]
				]);
const tiindicator1 = new TiIndicator();
tiindicator1.additionalData = new Map<string, unknown>([
					["id", "e58c072b-c9bb-a5c4-34ce-eb69af44fb1e"],
					["additionalInformation", "test again"]
				]);
requestBody.value = [
			tiindicator,
			tiindicator1
		]
const result = async () => {
	await graphServiceClient.security.tiIndicators.updateTiIndicators.post(requestBody);
}


```