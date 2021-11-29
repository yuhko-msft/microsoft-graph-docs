---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	expand : "customQuestions",
};
const result = async () => {
	await graphServiceClient.me.onlineMeetingsById("onlineMeeting-id").registration.get(requestParameters);
}


```