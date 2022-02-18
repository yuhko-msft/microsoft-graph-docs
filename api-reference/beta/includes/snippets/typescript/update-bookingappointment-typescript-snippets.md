---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new BookingAppointment()
requestBody.end = new DateTimeTimeZone();
requestBody.end.dateTime = "2018-05-06T12:30:00.0000000+00:00";
requestBody.end.timeZone = "UTC";
requestBody.end.additionalData = new Map([
			["@odata.type", "#microsoft.graph.dateTimeTimeZone"];
		]);
requestBody.invoiceDate = new DateTimeTimeZone();
requestBody.invoiceDate.dateTime = "2018-05-06T12:30:00.0000000+00:00";
requestBody.invoiceDate.timeZone = "UTC";
requestBody.invoiceDate.additionalData = new Map([
			["@odata.type", "#microsoft.graph.dateTimeTimeZone"];
		]);
requestBody.start = new DateTimeTimeZone();
requestBody.start.dateTime = "2018-05-06T12:00:00.0000000+00:00";
requestBody.start.timeZone = "UTC";
requestBody.start.additionalData = new Map([
			["@odata.type", "#microsoft.graph.dateTimeTimeZone"];
		]);
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.bookingAppointment"];
	]);
async () => {
	await graphServiceClient.bookingBusinessesById("bookingBusiness-id").appointmentsById("bookingAppointment-id").patch(requestBody);
}


```