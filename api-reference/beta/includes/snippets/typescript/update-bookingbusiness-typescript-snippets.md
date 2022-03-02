---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new BookingBusiness()
requestBody.email = "admin@fabrikam.com";
requestBody.schedulingPolicy = new BookingSchedulingPolicy();
requestBody.schedulingPolicy.timeSlotInterval = "PT60M";
requestBody.schedulingPolicy.minimumLeadTime = "P1D";
requestBody.schedulingPolicy.maximumAdvance = "P30D";
requestBody.schedulingPolicy.sendConfirmationsToOwner = true;
requestBody.schedulingPolicy.allowStaffSelection = true;
async () => {
	await graphServiceClient.bookingBusinessesById("bookingBusiness-id").patch(requestBody);
}


```