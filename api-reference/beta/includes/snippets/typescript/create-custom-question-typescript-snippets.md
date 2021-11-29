---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new MeetingRegistrationQuestion()
requestBody.displayName = "What's your job position?";
requestBody.isRequired = false;
requestBody.answerInputType = "text";
const result = async () => {
	await graphServiceClient.me.onlineMeetingsById("onlineMeeting-id").registration.customQuestions.post(requestBody);
}


```