---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new BookingService()
requestBody.defaultDuration = "PT30M";
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.bookingService"];
	]);
async () => {
	await graphServiceClient.bookingBusinessesById("bookingBusiness-id").servicesById("bookingService-id").patch(requestBody);
}


```