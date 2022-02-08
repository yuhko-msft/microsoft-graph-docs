---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new BookingStaffMember()
requestBody.workingHours = [
			new BookingWorkHours();
requestBody.workingHours.additionalData = new Map([
					["@odata.type", "#microsoft.graph.bookingWorkHours"];
					["day@odata.type", "#microsoft.graph.dayOfWeek"];
					["day", "monday"];
					["timeSlots@odata.type", "#Collection(microsoft.graph.bookingWorkTimeSlot)"];
					["timeSlots", [
						]
					],
				]);
			new BookingWorkHours();
requestBody.workingHours.additionalData = new Map([
					["@odata.type", "#microsoft.graph.bookingWorkHours"];
					["day@odata.type", "#microsoft.graph.dayOfWeek"];
					["day", "tuesday"];
					["timeSlots@odata.type", "#Collection(microsoft.graph.bookingWorkTimeSlot)"];
					["timeSlots", [
								 ["@odata.type" , "#microsoft.graph.bookingWorkTimeSlot"],
								 ["end" , "17:00:00.0000000"],
								 ["start" , "08:00:00.0000000"],
						]
					],
				]);
			new BookingWorkHours();
requestBody.workingHours.additionalData = new Map([
					["@odata.type", "#microsoft.graph.bookingWorkHours"];
					["day@odata.type", "#microsoft.graph.dayOfWeek"];
					["day", "wednesday"];
					["timeSlots@odata.type", "#Collection(microsoft.graph.bookingWorkTimeSlot)"];
					["timeSlots", [
								 ["@odata.type" , "#microsoft.graph.bookingWorkTimeSlot"],
								 ["end" , "17:00:00.0000000"],
								 ["start" , "08:00:00.0000000"],
						]
					],
				]);
			new BookingWorkHours();
requestBody.workingHours.additionalData = new Map([
					["@odata.type", "#microsoft.graph.bookingWorkHours"];
					["day@odata.type", "#microsoft.graph.dayOfWeek"];
					["day", "thursday"];
					["timeSlots@odata.type", "#Collection(microsoft.graph.bookingWorkTimeSlot)"];
					["timeSlots", [
								 ["@odata.type" , "#microsoft.graph.bookingWorkTimeSlot"],
								 ["end" , "17:00:00.0000000"],
								 ["start" , "08:00:00.0000000"],
						]
					],
				]);
			new BookingWorkHours();
requestBody.workingHours.additionalData = new Map([
					["@odata.type", "#microsoft.graph.bookingWorkHours"];
					["day@odata.type", "#microsoft.graph.dayOfWeek"];
					["day", "friday"];
					["timeSlots@odata.type", "#Collection(microsoft.graph.bookingWorkTimeSlot)"];
					["timeSlots", [
								 ["@odata.type" , "#microsoft.graph.bookingWorkTimeSlot"],
								 ["end" , "17:00:00.0000000"],
								 ["start" , "08:00:00.0000000"],
						]
					],
				]);
		]
	],
async () => {
	await graphServiceClient.bookingBusinessesById("bookingBusiness-id").staffMembersById("bookingStaffMember-id").patch(requestBody);
}


```