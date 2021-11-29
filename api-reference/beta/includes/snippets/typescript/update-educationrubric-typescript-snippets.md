---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new EducationRubric()
requestBody.displayName = "Example Credit Rubric after display name patch";
async () => {
	await graphServiceClient.education.me.rubricsById("educationRubric-id").patch(requestBody);
}


```