---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	filter : "startswith(displayName,'Eric')",
	select : "displayName,signInActivity",
};
const result = async () => {
	await graphServiceClient.users.get(requestParameters);
}


```