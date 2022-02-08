---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Event()
requestBody.subject = "Plan summer company picnic";
requestBody.body = new ItemBody();
requestBody.body.contentType = "HTML";
requestBody.body.content = "Let's kick-start this event planning!";
requestBody.start = new DateTimeTimeZone();
requestBody.start.dateTime = "2017-08-30T11:00:00";
requestBody.start.timeZone = "Pacific Standard Time";
requestBody.end = new DateTimeTimeZone();
requestBody.end.dateTime = "2017-08-30T12:00:00";
requestBody.end.timeZone = "Pacific Standard Time";
requestBody.attendees = [
			new Attendee();
requestBody.attendees.additionalData = new Map([
						 ["address" , "DanaS@contoso.onmicrosoft.com"],
						 ["name" , "Dana Swope"],
					["type", "Required"];
				]);
			new Attendee();
requestBody.attendees.additionalData = new Map([
						 ["address" , "AlexW@contoso.onmicrosoft.com"],
						 ["name" , "Alex Wilber"],
					["type", "Required"];
				]);
		]
	],
requestBody.location = new Location();
requestBody.location.displayName = "Conf Room 3; Fourth Coffee; Home Office";
requestBody.location.locationType = "Default";
requestBody.locations = [
			new Location();
requestBody.locations.additionalData = new Map([
					["displayName", "Conf Room 3"];
				]);
			new Location();
requestBody.locations.additionalData = new Map([
					["displayName", "Fourth Coffee"];
						 ["street" , "4567 Main St"],
						 ["city" , "Redmond"],
						 ["state" , "WA"],
						 ["countryOrRegion" , "US"],
						 ["postalCode" , "32008"],
						 ["latitude" , 47.672],
						 ["longitude" , -102.103],
				]);
			new Location();
requestBody.locations.additionalData = new Map([
					["displayName", "Home Office"];
				]);
		]
	],
requestBody.allowNewTimeProposals = true;
const headers = {
	"Prefer": "outlook.timezone=\"Pacific Standard Time\"",
};
const result = async () => {
	await graphServiceClient.me.events.post(requestBody, headers);
}


```