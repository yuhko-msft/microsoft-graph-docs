---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new BookingCustomer()
requestBody.displayName = "Adele";
requestBody.emailAddress = "adele@relecloud.com";
async () => {
	await graphServiceClient.bookingBusinessesById("bookingBusiness-id").customersById("bookingCustomer-id").patch(requestBody);
}


```