---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map([
		["userId", "70e47528-2fae-42b5-9d8e-ee73ccd90603"];
		["state", "clockedOut"];
		["confirmedBy", "None"];
		["notes", null],
			 ["dateTime" , "2021-05-21T21:58:41.327Z"],
			 ["atApprovedLocation" , null],
				 ["contentType" , "text"],
				 ["content" , "update sample notes"],
			 ["dateTime" , "2021-05-21T22:01:46.205Z"],
			 ["atApprovedLocation" , null],
				 ["contentType" , "text"],
				 ["content" , "update sample notes"],
		["breaks", [
					 ["breakId" , "BRK_138f4751-68b1-44c1-aca2-2b26cba9e73f"],
					 ["notes" , null],
						 ["dateTime" , "2021-05-21T21:59:59.328Z"],
						 ["atApprovedLocation" , null],
							 ["contentType" , "text"],
							 ["content" , "update sample notes"],
						 ["dateTime" , "2021-05-21T22:01:10.205Z"],
						 ["atApprovedLocation" , null],
							 ["contentType" , "text"],
							 ["content" , "update sample notes"],
			]
		],
	]);
async () => {
	await graphServiceClient.teamsById("team-id").schedule.timeCardsById("timeCard-id").put(requestBody);
}


```