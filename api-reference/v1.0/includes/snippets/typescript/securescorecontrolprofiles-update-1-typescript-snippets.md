---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new SecureScoreControlProfile()
requestBody.vendorInformation = new SecurityVendorInformation();
requestBody.vendorInformation.provider = "SecureScore";
requestBody.vendorInformation.providerVersion = null,
requestBody.vendorInformation.subProvider = null,
requestBody.vendorInformation.vendor = "Microsoft";
requestBody.additionalData = new Map([
		["assignedTo", ""];
		["comment", "control is reviewed"];
		["state", "Reviewed"];
	]);
async () => {
	await graphServiceClient.security.secureScoreControlProfilesById("secureScoreControlProfile-id").patch(requestBody);
}


```