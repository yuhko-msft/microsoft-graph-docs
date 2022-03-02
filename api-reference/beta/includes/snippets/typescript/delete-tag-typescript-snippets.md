---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	forcedelete : true,
};
async () => {
	await graphServiceClient.compliance.ediscovery.casesById("case-id").tagsById("tag-id").delete(requestParameters);
}


```