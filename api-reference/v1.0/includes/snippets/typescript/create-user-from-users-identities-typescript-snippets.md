---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new User()
requestBody.displayName = "John Smith";
requestBody.identities = [
			new ObjectIdentity();
requestBody.identities.additionalData = new Map([
					["signInType", "userName"];
					["issuer", "contoso.onmicrosoft.com"];
					["issuerAssignedId", "johnsmith"];
				]);
			new ObjectIdentity();
requestBody.identities.additionalData = new Map([
					["signInType", "emailAddress"];
					["issuer", "contoso.onmicrosoft.com"];
					["issuerAssignedId", "jsmith@yahoo.com"];
				]);
			new ObjectIdentity();
requestBody.identities.additionalData = new Map([
					["signInType", "federated"];
					["issuer", "facebook.com"];
					["issuerAssignedId", "5eecb0cd"];
				]);
		]
	],
requestBody.passwordProfile = new PasswordProfile();
requestBody.passwordProfile.password = "password-value";
requestBody.passwordProfile.forceChangePasswordNextSignIn = false;
requestBody.passwordPolicies = "DisablePasswordExpiration";
const result = async () => {
	await graphServiceClient.users.post(requestBody);
}


```