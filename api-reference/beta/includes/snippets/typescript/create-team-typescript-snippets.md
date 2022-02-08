---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map([
			 ["allowCreateUpdateChannels" , true],
			 ["allowUserEditMessages" , true],
			 ["allowUserDeleteMessages" , true],
			 ["allowGiphy" , true],
			 ["giphyContentRating" , "strict"],
			 ["showInTeamsSearchAndSuggestions" , true],
	]);
async () => {
	await graphServiceClient.groupsById("group-id").team.put(requestBody);
}


```