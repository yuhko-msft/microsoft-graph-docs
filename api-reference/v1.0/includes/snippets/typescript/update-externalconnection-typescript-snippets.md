---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ExternalConnection()
requestBody.name = "Contoso HR Service Tickets";
requestBody.description = "Connection to index HR service tickets";
async () => {
	await graphServiceClient.external.connectionsById("externalConnection-id").patch(requestBody);
}


```