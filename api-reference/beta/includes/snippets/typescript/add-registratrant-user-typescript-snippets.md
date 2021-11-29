---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new MeetingRegistrant()
requestBody.firstName = "Frederick";
requestBody.lastName = "Cormier";
requestBody.email = "frederick.cormier@contoso.com";
requestBody.customQuestionAnswers = [
			new CustomQuestionAnswer();
requestBody.customQuestionAnswers.additionalData = new Map([
					["questionId", "MSM5YjlmM2Q4ZS03ZmVkLTRmN3gwMDIw94MDAyMF9hX3gwMDIwX2RldmU="];
					["value", "No"];
				]);
			new CustomQuestionAnswer();
requestBody.customQuestionAnswers.additionalData = new Map([
					["questionId", "MSM5M2E2OWQ1Ni1jZTc4LTQDAwMjBfZGlkX3gwMDIwX3lvdV94MDAyMF8="];
					["value", "Internet"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.usersById("user-id").onlineMeetingsById("onlineMeeting-id").registration.registrants.post(requestBody);
}


```