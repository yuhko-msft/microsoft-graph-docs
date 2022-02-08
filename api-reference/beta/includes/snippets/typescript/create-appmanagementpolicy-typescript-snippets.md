---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AppManagementPolicy()
requestBody.displayName = "Credential management policy";
requestBody.description = "Cred policy sample";
requestBody.isEnabled = true;
requestBody.restrictions = new AppManagementConfiguration();
requestBody.restrictions.passwordCredentials = [
				new PasswordCredentialConfiguration();
requestBody.restrictions.passwordCredentials.additionalData = new Map([
						["restrictionType", "passwordAddition"];
						["maxLifetime", null],
						["restrictForAppsCreatedAfterDateTime", "2019-10-19T10:37:00Z"];
					]);
				new PasswordCredentialConfiguration();
requestBody.restrictions.passwordCredentials.additionalData = new Map([
						["restrictionType", "passwordLifetime"];
						["maxLifetime", "P4DT12H30M5S"];
						["restrictForAppsCreatedAfterDateTime", "2014-10-19T10:37:00Z"];
					]);
				new PasswordCredentialConfiguration();
requestBody.restrictions.passwordCredentials.additionalData = new Map([
						["restrictionType", "symmetricKeyAddition"];
						["maxLifetime", null],
						["restrictForAppsCreatedAfterDateTime", "2019-10-19T10:37:00Z"];
					]);
				new PasswordCredentialConfiguration();
requestBody.restrictions.passwordCredentials.additionalData = new Map([
						["restrictionType", "symmetricKeyLifetime"];
						["maxLifetime", "P4D"];
						["restrictForAppsCreatedAfterDateTime", "2014-10-19T10:37:00Z"];
					]);
			]
		],
requestBody.restrictions.keyCredentials = [
				new KeyCredentialConfiguration();
requestBody.restrictions.keyCredentials.additionalData = new Map([
						["restrictionType", "asymmetricKeyLifetime"];
						["maxLifetime", "P90D"];
						["restrictForAppsCreatedAfterDateTime", "2014-10-19T10:37:00Z"];
					]);
			]
		],
const result = async () => {
	await graphServiceClient.policies.appManagementPolicies.post(requestBody);
}


```