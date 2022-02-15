---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new EducationOutcome()
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.educationFeedbackOutcome"];
				 ["content" , "This is feedback for the assignment as a whole."],
				 ["contentType" , "text"],
	]);
async () => {
	await graphServiceClient.education.classesById("educationClass-id").assignmentsById("educationAssignment-id").submissionsById("educationSubmission-id").outcomesById("educationOutcome-id").patch(requestBody);
}


```