---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PlannerAssignedToTaskBoardTaskFormat()
requestBody.orderHintsByAssignee = new PlannerOrderHintsByAssignee();
requestBody.orderHintsByAssignee.additionalData = new Map([
			["aaa27244-1db4-476a-a5cb-004607466324", "8566473P 957764Jk!"];
		]);
const headers = {
	"Prefer": "return=representation",
	"If-Match": "W/\"JzEtVGFzayAgQEBAQEBAQEBAQEBAQEBAWCc=\"",
};
async () => {
	await graphServiceClient.planner.tasksById("plannerTask-id").assignedToTaskBoardFormat.patch(requestBody, headers);
}


```