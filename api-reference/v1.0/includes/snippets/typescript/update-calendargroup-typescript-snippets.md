---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new CalendarGroup()
requestBody.name = "name-value";
async () => {
	await graphServiceClient.me.calendarGroupsById("calendarGroup-id").patch(requestBody);
}


```