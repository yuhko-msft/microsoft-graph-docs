---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AdministrativeUnit()
requestBody.displayName = "Greater Seattle District Technical Schools";
async () => {
	await graphServiceClient.directory.administrativeUnitsById("administrativeUnit-id").patch(requestBody);
}


```