---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new EducationAssignmentDefaults()
requestBody.addedStudentAction = "assignIfOpen";
requestBody.addToCalendarAction = "studentsAndTeamOwners";
requestBody.notificationChannelUrl = "https://graph.microsoft.com/beta/teams('id')/channels('id')";
async () => {
	await graphServiceClient.education.classesById("educationClass-id").assignmentDefaults.patch(requestBody);
}


```