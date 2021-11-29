---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new TimeOff()
requestBody.userId = "c5d0c76b-80c4-481c-be50-923cd8d680a1";
requestBody.sharedTimeOff = new TimeOffItem();
requestBody.sharedTimeOff.additionalData = new Map([
			["timeOffReasonId", "TOR_891045ca-b5d2-406b-aa06-a3c8921245d7"];
			["startDateTime", "2019-03-11T07:00:00Z"];
			["endDateTime", "2019-03-12T07:00:00Z"];
			["theme", "white"];
		]);
requestBody.draftTimeOff = new TimeOffItem();
requestBody.draftTimeOff.additionalData = new Map([
			["timeOffReasonId", "TOR_891045ca-b5d2-406b-aa06-a3c8921245d7"];
			["startDateTime", "2019-03-11T07:00:00Z"];
			["endDateTime", "2019-03-12T07:00:00Z"];
			["theme", "pink"];
		]);
const result = async () => {
	await graphServiceClient.teamsById("team-id").schedule.timesOff.post(requestBody);
}


```