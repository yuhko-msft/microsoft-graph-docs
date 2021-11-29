---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new GovernanceRoleSetting()
requestBody.adminEligibleSettings = [
			new GovernanceRuleSetting();
requestBody.adminEligibleSettings.additionalData = new Map([
					["ruleIdentifier", "ExpirationRule"];
					["setting", "{"permanentAssignment":false,"maximumGrantPeriodInMinutes":129600}"];
				]);
		]
	],
async () => {
	await graphServiceClient.privilegedAccessById("privilegedAccess-id").roleSettingsById("governanceRoleSetting-id").patch(requestBody);
}


```