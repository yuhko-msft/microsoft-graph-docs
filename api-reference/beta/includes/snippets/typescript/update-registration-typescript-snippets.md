---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new MeetingRegistration()
requestBody.subject = "Microsoft Ignite: Day 1";
requestBody.startDateTime =  new Date("2021-11-02T08:00:00-08:00");
requestBody.endDateTime =  new Date("2021-11-02T15:45:00-08:00");
requestBody.speakers = [
			new MeetingSpeaker();
requestBody.speakers.additionalData = new Map([
					["displayName", "Henry Ross"];
					["bio", "Chairman and Chief Executive Officer"];
				]);
			new MeetingSpeaker();
requestBody.speakers.additionalData = new Map([
					["displayName", "Fred Ryan"];
					["bio", "CVP"];
				]);
		]
	],
async () => {
	await graphServiceClient.me.onlineMeetingsById("onlineMeeting-id").registration.patch(requestBody);
}


```