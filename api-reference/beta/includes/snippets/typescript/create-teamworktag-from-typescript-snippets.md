---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new TeamworkTag()
requestBody.displayName = "Finance";
requestBody.members = [
			new TeamworkTagMember();
requestBody.members.additionalData = new Map([
					["userId", "92f6952f-61ca-4a94-8910-508a240bc167"];
				]);
			new TeamworkTagMember();
requestBody.members.additionalData = new Map([
					["userId", "085d800c-b86b-4bfc-a857-9371ad1caf29"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.teamsById("team-id").tags.post(requestBody);
}


```