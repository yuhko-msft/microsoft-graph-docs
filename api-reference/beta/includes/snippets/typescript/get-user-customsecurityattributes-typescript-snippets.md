---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	select : "customSecurityAttributes",
};
const result = async () => {
	await graphServiceClient.usersById("user-id").get(requestParameters);
}


```