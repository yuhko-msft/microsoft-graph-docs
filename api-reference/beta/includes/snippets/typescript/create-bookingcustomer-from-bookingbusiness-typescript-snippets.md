---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new BookingCustomer()
requestBody.displayName = "Joni Sherman";
requestBody.emailAddress = "jonis@relecloud.com";
requestBody.addresses = [
			new PhysicalAddress();
requestBody.addresses.additionalData = new Map([
					["postOfficeBox", ""];
					["street", "4567 Main Street"];
					["city", "Buffalo"];
					["state", "NY"];
					["countryOrRegion", "USA"];
					["postalCode", "98052"];
					["type", "home"];
				]);
			new PhysicalAddress();
requestBody.addresses.additionalData = new Map([
					["postOfficeBox", ""];
					["street", "4570 Main Street"];
					["city", "Buffalo"];
					["state", "NY"];
					["countryOrRegion", "USA"];
					["postalCode", "98054"];
					["type", "business"];
				]);
		]
	],
requestBody.phones = [
			new Phone();
requestBody.phones.additionalData = new Map([
					["number", "206-555-0100"];
					["type", "home"];
				]);
			new Phone();
requestBody.phones.additionalData = new Map([
					["number", "206-555-0200"];
					["type", "business"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.bookingBusinessesById("bookingBusiness-id").customers.post(requestBody);
}


```