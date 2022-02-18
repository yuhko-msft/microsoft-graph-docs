---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.assignments = [
			new CloudPcUserSettingAssignment();
requestBody.assignments.additionalData = new Map([
					["id", "b0c2d35f-3385-46c8-a6f5-6c3dfad7708b_64ff06de-9c00-4a5a-98b5-7f5abe26ffff"];
						 ["@odata.type" , "microsoft.graph.cloudPcManagementGroupAssignmentTarget"],
						 ["groupId" , "64ff06de-9c00-4a5a-98b5-7f5abe26ffff"],
				]);
		]
	],
async () => {
	await graphServiceClient.deviceManagement.virtualEndpoint.userSettingsById("cloudPcUserSetting-id").assign.post(requestBody);
}


```