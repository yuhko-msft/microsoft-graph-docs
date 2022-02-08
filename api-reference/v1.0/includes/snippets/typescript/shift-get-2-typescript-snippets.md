---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ShiftPreferences()
requestBody.id = "SHPR_eeab4fb1-20e5-48ca-ad9b-98119d94bee7";
requestBody.availability = [
			new ShiftAvailability();
requestBody.availability.additionalData = new Map([
							 ["type" , "Weekly"],
							 ["daysOfWeek" , [
									"Monday";
									"Wednesday";
									"Friday";
								]
							],
							 ["interval" , 1],
							 ["type" , "noEnd"],
					["timeZone", "Pacific Standard Time"];
					["timeSlots", null],
				]);
		]
	],
requestBody.additionalData = new Map([
		["@odata.etag", "1a371e53-f0a6-4327-a1ee-e3c56e4b38aa"];
	]);
async () => {
	await graphServiceClient.usersById("user-id").settings.shiftPreferences.patch(requestBody);
}


```