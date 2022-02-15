---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.attendees = [
			new AttendeeBase();
requestBody.attendees.additionalData = new Map([
					["type", "required"];
						 ["name" , "Alex Wilbur"],
						 ["address" , "alexw@contoso.onmicrosoft.com"],
				]);
		]
	],
requestBody.locationConstraint = new LocationConstraint();
requestBody.locationConstraint.isRequired = false;
requestBody.locationConstraint.suggestLocation = false;
requestBody.locationConstraint.locations = [
				new LocationConstraintItem();
requestBody.locationConstraint.locations.additionalData = new Map([
						["resolveAvailability", false];
						["displayName", "Conf room Hood"];
					]);
			]
		],
requestBody.timeConstraint = new TimeConstraint();
requestBody.timeConstraint.activityDomain = "work";
requestBody.timeConstraint.timeSlots = [
				new TimeSlot();
requestBody.timeConstraint.timeSlots.additionalData = new Map([
							 ["dateTime" , "2019-04-16T09:00:00"],
							 ["timeZone" , "Pacific Standard Time"],
							 ["dateTime" , "2019-04-18T17:00:00"],
							 ["timeZone" , "Pacific Standard Time"],
					]);
			]
		],
requestBody.isOrganizerOptional = "false";
requestBody.meetingDuration = "PT1H";
requestBody.returnSuggestionReasons = "true";
requestBody.minimumAttendeePercentage = "100";
const headers = {
	"Prefer": "outlook.timezone=\"Pacific Standard Time\"",
};
const result = async () => {
	await graphServiceClient.me.findMeetingTimes.post(requestBody, headers);
}


```