---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map<string, unknown>([
		["@odata.type", "#microsoft.graph.externalMeetingRegistration"],
		["allowedRegistrant", "everyone"]
	]);
async () => {
	await graphServiceClient.me.onlineMeetingsById("onlineMeeting-id").registration.post(requestBody);
}


```