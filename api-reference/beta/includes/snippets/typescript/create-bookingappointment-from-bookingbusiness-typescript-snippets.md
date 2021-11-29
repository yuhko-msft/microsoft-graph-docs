---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new BookingAppointment()
requestBody.customerEmailAddress = "jordanm@contoso.com";
requestBody.customerLocation = new Location();
requestBody.customerLocation.address = new PhysicalAddress();
requestBody.customerLocation.address.city = "Buffalo";
requestBody.customerLocation.address.countryOrRegion = "USA";
requestBody.customerLocation.address.postalCode = "98052";
requestBody.customerLocation.address.postOfficeBox = null,
requestBody.customerLocation.address.state = "NY";
requestBody.customerLocation.address.street = "123 First Avenue";
requestBody.customerLocation.address.type = null,
requestBody.customerLocation.address.additionalData = new Map([
				["@odata.type", "#microsoft.graph.physicalAddress"];
				["type@odata.type", "#microsoft.graph.physicalAddressType"];
			]);
requestBody.customerLocation.coordinates = null,
requestBody.customerLocation.displayName = "Customer";
requestBody.customerLocation.locationEmailAddress = null,
requestBody.customerLocation.locationType = null,
requestBody.customerLocation.locationUri = null,
requestBody.customerLocation.uniqueId = null,
requestBody.customerLocation.uniqueIdType = null,
requestBody.customerLocation.additionalData = new Map([
			["@odata.type", "#microsoft.graph.location"];
			["locationType@odata.type", "#microsoft.graph.locationType"];
			["uniqueIdType@odata.type", "#microsoft.graph.locationUniqueIdType"];
		]);
requestBody.customerName = "Jordan Miller";
requestBody.customerNotes = "Please be on time.";
requestBody.customerPhone = "213-555-0199";
requestBody.customerTimeZone = "America/Chicago";
requestBody.smsNotificationsEnabled = true;
requestBody.end = new DateTimeTimeZone();
requestBody.end.dateTime = "2018-05-01T12:30:00.0000000+00:00";
requestBody.end.timeZone = "UTC";
requestBody.end.additionalData = new Map([
			["@odata.type", "#microsoft.graph.dateTimeTimeZone"];
		]);
requestBody.invoiceAmount = 10.0;
requestBody.invoiceDate = new DateTimeTimeZone();
requestBody.invoiceDate.dateTime = "2018-05-01T12:30:00.0000000+00:00";
requestBody.invoiceDate.timeZone = "UTC";
requestBody.invoiceDate.additionalData = new Map([
			["@odata.type", "#microsoft.graph.dateTimeTimeZone"];
		]);
requestBody.invoiceId = "1001";
requestBody.invoiceStatus = "open";
requestBody.invoiceUrl = "theInvoiceUrl";
requestBody.isLocationOnline = true;
requestBody.optOutOfCustomerEmail = false;
requestBody.postBuffer = "PT10M";
requestBody.preBuffer = "PT5M";
requestBody.price = 10.0;
requestBody.priceType = "fixedPrice";
requestBody.reminders = [
			new BookingReminder();
requestBody.reminders.additionalData = new Map([
					["@odata.type", "#microsoft.graph.bookingReminder"];
					["message", "This service is tomorrow"];
					["offset", "P1D"];
					["recipients@odata.type", "#microsoft.graph.bookingReminderRecipients"];
					["recipients", "allAttendees"];
				]);
			new BookingReminder();
requestBody.reminders.additionalData = new Map([
					["@odata.type", "#microsoft.graph.bookingReminder"];
					["message", "Please be available to enjoy your lunch service."];
					["offset", "PT1H"];
					["recipients@odata.type", "#microsoft.graph.bookingReminderRecipients"];
					["recipients", "customer"];
				]);
			new BookingReminder();
requestBody.reminders.additionalData = new Map([
					["@odata.type", "#microsoft.graph.bookingReminder"];
					["message", "Please check traffic for next cater."];
					["offset", "PT2H"];
					["recipients@odata.type", "#microsoft.graph.bookingReminderRecipients"];
					["recipients", "staff"];
				]);
		]
	],
requestBody.serviceId = "57da6774-a087-4d69-b0e6-6fb82c339976";
requestBody.serviceLocation = new Location();
requestBody.serviceLocation.address = new PhysicalAddress();
requestBody.serviceLocation.address.city = "Buffalo";
requestBody.serviceLocation.address.countryOrRegion = "USA";
requestBody.serviceLocation.address.postalCode = "98052";
requestBody.serviceLocation.address.postOfficeBox = null,
requestBody.serviceLocation.address.state = "NY";
requestBody.serviceLocation.address.street = "123 First Avenue";
requestBody.serviceLocation.address.type = null,
requestBody.serviceLocation.address.additionalData = new Map([
				["@odata.type", "#microsoft.graph.physicalAddress"];
				["type@odata.type", "#microsoft.graph.physicalAddressType"];
			]);
requestBody.serviceLocation.coordinates = null,
requestBody.serviceLocation.displayName = "Customer location";
requestBody.serviceLocation.locationEmailAddress = null,
requestBody.serviceLocation.locationType = null,
requestBody.serviceLocation.locationUri = null,
requestBody.serviceLocation.uniqueId = null,
requestBody.serviceLocation.uniqueIdType = null,
requestBody.serviceLocation.additionalData = new Map([
			["@odata.type", "#microsoft.graph.location"];
			["locationType@odata.type", "#microsoft.graph.locationType"];
			["uniqueIdType@odata.type", "#microsoft.graph.locationUniqueIdType"];
		]);
requestBody.serviceName = "Catered bento";
requestBody.serviceNotes = "Customer requires punctual service.";
requestBody.start = new DateTimeTimeZone();
requestBody.start.dateTime = "2018-05-01T12:00:00.0000000+00:00";
requestBody.start.timeZone = "UTC";
requestBody.start.additionalData = new Map([
			["@odata.type", "#microsoft.graph.dateTimeTimeZone"];
		]);
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.bookingAppointment"];
		["invoiceStatus@odata.type", "#microsoft.graph.bookingInvoiceStatus"];
		["priceType@odata.type", "#microsoft.graph.bookingPriceType"];
		["reminders@odata.type", "#Collection(microsoft.graph.bookingReminder)"];
	]);
const result = async () => {
	await graphServiceClient.bookingBusinessesById("bookingBusiness-id").appointments.post(requestBody);
}


```