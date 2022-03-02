---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PlannerTaskDetails()
requestBody.previewType = "noPreview";
requestBody.references = new PlannerExternalReferences();
requestBody.references.additionalData = new Map<string, unknown>([
				 ["@odata.type" , "microsoft.graph.plannerExternalReference"],
				 ["alias" , "Documentation"],
				 ["previewPriority" , " !"],
				 ["type" , "Other"],
				 ["@odata.type" , "microsoft.graph.plannerExternalReference"],
				 ["previewPriority" , "  !!"],
			["http%3A//www%2Ebing%2Ecom", null],
		]);
requestBody.checklist = new PlannerChecklistItems();
requestBody.checklist.additionalData = new Map<string, unknown>([
				 ["@odata.type" , "microsoft.graph.plannerChecklistItem"],
				 ["title" , "Update task details"],
				 ["isChecked" , true],
				 ["@odata.type" , "microsoft.graph.plannerChecklistItem"],
				 ["isChecked" , true],
			["a93c93c5-10a6-4167-9551-8bafa09967a7", null],
		]);
const headers = {
	"Prefer": "return=representation",
	"If-Match": "W/\"JzEtVGFzayAgQEBAQEBAQEBAQEBAQEBAWCc=\"",
};
async () => {
	await graphServiceClient.planner.tasksById("plannerTask-id").details.patch(requestBody, headers);
}


```