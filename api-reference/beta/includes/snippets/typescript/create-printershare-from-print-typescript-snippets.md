---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PrinterShare()
requestBody.name = "name-value";
requestBody.additionalData = new Map([
		["printer@odata.bind", "https://graph.microsoft.com/beta/print/printers/{id}"];
	]);
const result = async () => {
	await graphServiceClient.print.shares.post(requestBody);
}


```