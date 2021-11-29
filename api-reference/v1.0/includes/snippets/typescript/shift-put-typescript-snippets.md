---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Shift()
requestBody.id = "SHFT_577b75d2-a927-48c0-a5d1-dc984894e7b8";
requestBody.createdDateTime =  new Date("2019-03-14T04:32:51.451Z");
requestBody.lastModifiedDateTime =  new Date("2019-03-14T05:32:51.451Z");
requestBody.userId = "c5d0c76b-80c4-481c-be50-923cd8d680a1";
requestBody.schedulingGroupId = "TAG_228940ed-ff84-4e25-b129-1b395cf78be0";
requestBody.lastModifiedBy = new IdentitySet();
requestBody.lastModifiedBy.application = null,
requestBody.lastModifiedBy.device = null,
requestBody.lastModifiedBy.user = new Identity();
requestBody.lastModifiedBy.user.id = "366c0b19-49b1-41b5-a03f-9f3887bd0ed8";
requestBody.lastModifiedBy.user.displayName = "John Doe";
requestBody.lastModifiedBy.additionalData = new Map([
			["conversation", null],
		]);
requestBody.sharedShift = new ShiftItem();
requestBody.sharedShift.additionalData = new Map([
			["displayName", "Day shift"];
			["notes", "Please do inventory as part of your shift."];
			["startDateTime", "2019-03-11T15:00:00Z"];
			["endDateTime", "2019-03-12T00:00:00Z"];
			["theme", "blue"];
			["activities", [
						 ["isPaid" , true],
						 ["startDateTime" , "2019-03-11T15:00:00Z"],
						 ["endDateTime" , "2019-03-11T15:15:00Z"],
						 ["code" , ""],
						 ["displayName" , "Lunch"],
				]
			],
		]);
requestBody.draftShift = new ShiftItem();
requestBody.draftShift.additionalData = new Map([
			["displayName", "Day shift"];
			["notes", "Please do inventory as part of your shift."];
			["startDateTime", "2019-03-11T15:00:00Z"];
			["endDateTime", "2019-03-12T00:00:00Z"];
			["theme", "blue"];
			["activities", [
						 ["isPaid" , true],
						 ["startDateTime" , "2019-03-11T15:00:00Z"],
						 ["endDateTime" , "2019-03-11T15:30:00Z"],
						 ["code" , ""],
						 ["displayName" , "Lunch"],
				]
			],
		]);
const headers = {
	"Prefer": "return=representation",
};
async () => {
	await graphServiceClient.teamsById("team-id").schedule.shiftsById("shift-id").patch(requestBody, headers);
}


```