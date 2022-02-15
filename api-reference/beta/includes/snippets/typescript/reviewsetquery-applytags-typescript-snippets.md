---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.tagsToAdd = [
			new Tag();
requestBody.tagsToAdd.additionalData = new Map([
					["id", "b4798d14-748d-468e-a1ec-96a2b1d49677"];
				]);
		]
	],
async () => {
	await graphServiceClient.compliance.ediscovery.casesById("case-id").reviewSetsById("reviewSet-id").queriesById("reviewSetQuery-id").applyTags.post(requestBody);
}


```