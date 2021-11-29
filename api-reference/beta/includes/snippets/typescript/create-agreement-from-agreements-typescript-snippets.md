---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Agreement()
requestBody.displayName = "MSGraph Sample";
requestBody.isViewingBeforeAcceptanceRequired = true;
requestBody.files = [
			new AgreementFileLocalization();
requestBody.files.additionalData = new Map([
					["fileName", "TOU.pdf"];
					["language", "en"];
					["isDefault", true];
						 ["data" , "SGVsbG8gd29ybGQ="],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.identityGovernance.termsOfUse.agreements.post(requestBody);
}


```