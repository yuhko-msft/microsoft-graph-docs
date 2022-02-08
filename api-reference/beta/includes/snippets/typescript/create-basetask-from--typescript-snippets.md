---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new BaseTask()
requestBody.body = new ItemBody();
requestBody.body.additionalData = new Map([
			["@odata.type", "microsoft.graph.itemBody"];
		]);
requestBody.bodyLastModifiedDateTime =  new Date("String (timestamp)");
requestBody.completedDateTime =  new Date("String (timestamp)");
requestBody.dueDateTime = new DateTimeTimeZone();
requestBody.dueDateTime.additionalData = new Map([
			["@odata.type", "microsoft.graph.dateTimeTimeZone"];
		]);
requestBody.startDateTime = new DateTimeTimeZone();
requestBody.startDateTime.additionalData = new Map([
			["@odata.type", "microsoft.graph.dateTimeTimeZone"];
		]);
requestBody.importance = "String";
requestBody.recurrence = new PatternedRecurrence();
requestBody.recurrence.additionalData = new Map([
			["@odata.type", "microsoft.graph.patternedRecurrence"];
		]);
requestBody.displayName = "String";
requestBody.status = "String";
requestBody.personalProperties = new PersonalTaskProperties();
requestBody.personalProperties.additionalData = new Map([
			["@odata.type", "microsoft.graph.personalTaskProperties"];
		]);
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.baseTask"];
	]);
const result = async () => {
	await graphServiceClient.me.tasks.listsById("baseTaskList-id").tasks.post(requestBody);
}


```