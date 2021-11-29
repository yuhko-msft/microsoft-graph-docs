---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new OpenShift()
requestBody.schedulingGroupId = "TAG_228940ed-ff84-4e25-b129-1b395cf78be0";
requestBody.sharedOpenShift = new OpenShiftItem();
requestBody.sharedOpenShift.additionalData = new Map([
			["notes", "Inventory Management"];
			["openSlotCount", 5];
			["displayName", "Field shift"];
			["startDateTime", "2018-10-04T00:58:45.340Z"];
			["endDateTime", "2018-10-04T09:50:45.332Z"];
			["theme", "white"];
			["activities", [
						 ["isPaid" , true],
						 ["startDateTime" , "2018-10-04T00:58:45.340Z"],
						 ["endDateTime" , "2018-10-04T01:58:45.340Z"],
						 ["code" , ""],
						 ["displayName" , "Lunch"],
				]
			],
		]);
requestBody.draftOpenShift = null,
async () => {
	await graphServiceClient.teamsById("team-id").schedule.openShiftsById("openShift-id").patch(requestBody);
}


```