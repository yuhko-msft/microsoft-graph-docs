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
	select : "displayName,jobTitle,mobilePhone",
};
const result = async () => {
	await graphServiceClient.users.delta().get(requestParameters, headers);
}


```