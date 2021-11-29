---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new SecurityAction()
requestBody.name = "BlockIp";
requestBody.actionReason = "Test";
requestBody.parameters = [
			new KeyValuePair();
requestBody.parameters.additionalData = new Map([
					["name", "IP"];
					["value", "1.2.3.4"];
				]);
		]
	],
requestBody.vendorInformation = new SecurityVendorInformation();
requestBody.vendorInformation.provider = "Windows Defender ATP";
requestBody.vendorInformation.vendor = "Microsoft";
const result = async () => {
	await graphServiceClient.security.securityActions.post(requestBody);
}


```