---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AdministrativeUnit()
requestBody.displayName = "displayName-value";
requestBody.description = "description-value";
requestBody.visibility = "visibility-value";
async () => {
	await graphServiceClient.administrativeUnitsById("administrativeUnit-id").patch(requestBody);
}


```