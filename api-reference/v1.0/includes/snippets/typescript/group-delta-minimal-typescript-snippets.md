---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const headers = {
	"Prefer": "return=minimal",
};
let requestParameters = {
	select : "displayName,description,mailNickname",
};
const result = async () => {
	await graphServiceClient.groupsById("group-id").get(requestParameters, headers);
}


```