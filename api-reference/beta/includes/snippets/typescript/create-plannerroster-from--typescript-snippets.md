---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PlannerRoster()
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.plannerRoster"];
	]);
const result = async () => {
	await graphServiceClient.planner.rosters.post(requestBody);
}


```