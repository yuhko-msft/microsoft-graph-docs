---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const headers = {
	"ConsistencyLevel": "eventual",
};
let requestParameters = {
	search : "%22displayName:Web%22",
	count : true,
};
const result = async () => {
	await graphServiceClient.applications.get(requestParameters, headers);
}


```