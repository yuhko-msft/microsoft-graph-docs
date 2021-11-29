---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PlannerTask()
requestBody.assignments = new PlannerAssignments();
requestBody.assignments.additionalData = new Map([
				 ["@odata.type" , "#microsoft.graph.plannerAssignment"],
				 ["orderHint" , "N9917 U2883!"],
		]);
requestBody.appliedCategories = new PlannerAppliedCategories();
requestBody.appliedCategories.additionalData = new Map([
			["category3", true];
			["category4", false];
		]);
const headers = {
	"Prefer": "return=representation",
	"If-Match": "W/\"JzEtVGFzayAgQEBAQEBAQEBAQEBAQEBAWCc=\"",
};
async () => {
	await graphServiceClient.planner.tasksById("plannerTask-id").patch(requestBody, headers);
}


```