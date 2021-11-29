---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Printer()
requestBody.location = new PrinterLocation();
requestBody.location.latitude = 1.1;
requestBody.location.longitude = 2.2;
requestBody.location.altitudeInMeters = 3;
requestBody.additionalData = new Map([
		["name", "PrinterName"];
	]);
async () => {
	await graphServiceClient.print.printersById("printer-id").patch(requestBody);
}


```