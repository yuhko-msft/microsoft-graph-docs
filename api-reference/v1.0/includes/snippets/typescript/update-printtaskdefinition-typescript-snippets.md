---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PrintTaskDefinition()
requestBody.displayName = "Test TaskDefinitionName";
requestBody.createdBy = new AppIdentity();
requestBody.createdBy.displayName = "Requesting App Display Name";
async () => {
	await graphServiceClient.print.taskDefinitionsById("printTaskDefinition-id").patch(requestBody);
}


```