---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new PrinterShare()
requestBody.displayName = "PrinterShare Name";
requestBody.allowAllUsers = false;
requestBody.additionalData = new Map([
		["printer@odata.bind", "https://graph.microsoft.com/v1.0/print/printers/{printerId}"];
	]);
async () => {
	await graphServiceClient.print.sharesById("printerShare-id").patch(requestBody);
}


```