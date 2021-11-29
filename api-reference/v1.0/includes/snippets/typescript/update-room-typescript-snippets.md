---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Place()
requestBody.additionalData = new Map([
		["@odata.type", "microsoft.graph.room"];
		["nickname", "Conf Room"];
		["building", "1"];
		["label", "100"];
		["capacity", 50];
		["isWheelChairAccessible", false];
	]);
async () => {
	await graphServiceClient.placesById("place-id").patch(requestBody);
}


```