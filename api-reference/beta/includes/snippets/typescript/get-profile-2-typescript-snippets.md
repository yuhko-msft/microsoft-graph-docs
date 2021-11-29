---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	expand : "names($select=first,last),skills($select=displayName)",
};
const result = async () => {
	await graphServiceClient.me.profile.get(requestParameters);
}


```