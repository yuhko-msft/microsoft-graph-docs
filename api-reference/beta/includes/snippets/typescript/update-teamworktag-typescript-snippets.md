---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new TeamworkTag()
requestBody.displayName = "Finance";
async () => {
	await graphServiceClient.teamsById("team-id").tagsById("teamworkTag-id").patch(requestBody);
}


```