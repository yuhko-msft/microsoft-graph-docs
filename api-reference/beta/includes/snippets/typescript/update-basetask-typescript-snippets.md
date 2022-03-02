---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new BaseTask()
requestBody.bodyLastModifiedDateTime =  new Date("String (timestamp)");
requestBody.completedDateTime =  new Date("String (timestamp)");
requestBody.dueDateTime = new DateTimeTimeZone();
requestBody.dueDateTime.additionalData = new Map<string, unknown>([
			["@odata.type", "microsoft.graph.dateTimeTimeZone"]
		]);
requestBody.startDateTime = new DateTimeTimeZone();
requestBody.startDateTime.additionalData = new Map<string, unknown>([
			["@odata.type", "microsoft.graph.dateTimeTimeZone"]
		]);
requestBody.importance = "String";
requestBody.recurrence = new PatternedRecurrence();
requestBody.recurrence.additionalData = new Map<string, unknown>([
			["@odata.type", "microsoft.graph.patternedRecurrence"]
		]);
requestBody.displayName = "String";
requestBody.status = "String";
requestBody.additionalData = new Map<string, unknown>([
		["@odata.type", "#microsoft.graph.baseTask"],
			 ["@odata.type" , "microsoft.graph.itemBody"],
			 ["@odata.type" , "microsoft.graph.personalTaskProperties"],
	]);
async () => {
	await graphServiceClient.me.tasks.listsById("baseTaskList-id").tasksById("baseTask-id").patch(requestBody);
}


```