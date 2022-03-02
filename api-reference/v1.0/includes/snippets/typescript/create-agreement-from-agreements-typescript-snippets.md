---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Agreement()
requestBody.displayName = "MSGraph Sample";
requestBody.isViewingBeforeAcceptanceRequired = true;
const agreementfilelocalization = new AgreementFileLocalization();
agreementfilelocalization.additionalData = new Map<string, unknown>([
					["fileName", "TOU.pdf"],
					["language", "en"],
					["isDefault", true],
						 ["data" , "SGVsbG8gd29ybGQ="],
				]);
requestBody.files = [
			agreementfilelocalization
		]
const result = async () => {
	await graphServiceClient.identityGovernance.termsOfUse.agreements.post(requestBody);
}


```