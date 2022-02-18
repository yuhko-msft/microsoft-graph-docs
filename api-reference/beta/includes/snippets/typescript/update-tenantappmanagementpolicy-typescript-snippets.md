---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new TenantAppManagementPolicy()
requestBody.isEnabled = true;
requestBody.applicationRestrictions = new AppManagementConfiguration();
requestBody.applicationRestrictions.passwordCredentials = [
				new PasswordCredentialConfiguration();
requestBody.applicationRestrictions.passwordCredentials.additionalData = new Map([
						["restrictionType", "passwordAddition"];
						["maxLifetime", null],
						["restrictForAppsCreatedAfterDateTime", "2021-04-01T10:37:00Z"];
					]);
				new PasswordCredentialConfiguration();
requestBody.applicationRestrictions.passwordCredentials.additionalData = new Map([
						["restrictionType", "passwordLifetime"];
						["maxLifetime", "P4DT12H30M5S"];
						["restrictForAppsCreatedAfterDateTime", "2019-01-01T10:37:00Z"];
					]);
				new PasswordCredentialConfiguration();
requestBody.applicationRestrictions.passwordCredentials.additionalData = new Map([
						["restrictionType", "symmetricKeyAddition"];
						["maxLifetime", null],
						["restrictForAppsCreatedAfterDateTime", "2021-04-01T10:37:00Z"];
					]);
				new PasswordCredentialConfiguration();
requestBody.applicationRestrictions.passwordCredentials.additionalData = new Map([
						["restrictionType", "symmetricKeyLifetime"];
						["maxLifetime", "P40D"];
						["restrictForAppsCreatedAfterDateTime", "2015-04-01T10:37:00Z"];
					]);
			]
		],
requestBody.applicationRestrictions.keyCredentials = [
				new KeyCredentialConfiguration();
requestBody.applicationRestrictions.keyCredentials.additionalData = new Map([
						["restrictionType", "asymmetricKeyLifetime"];
						["maxLifetime", "P30D"];
						["restrictForAppsCreatedAfterDateTime", "2015-01-01T10:37:00Z"];
					]);
			]
		],
async () => {
	await graphServiceClient.policies.defaultAppManagementPolicy.patch(requestBody);
}


```