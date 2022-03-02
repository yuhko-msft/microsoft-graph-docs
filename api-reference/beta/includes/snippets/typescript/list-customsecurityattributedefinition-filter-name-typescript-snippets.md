---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	filter : "name%20eq%20'Project'%20and%20status%20eq%20'Available'",
};
const result = async () => {
	await graphServiceClient.directory.customSecurityAttributeDefinitions.get(requestParameters);
}


```