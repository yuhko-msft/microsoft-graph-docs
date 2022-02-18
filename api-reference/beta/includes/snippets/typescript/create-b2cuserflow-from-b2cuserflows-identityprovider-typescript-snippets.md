---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new B2cIdentityUserFlow()
requestBody.id = "Customer";
requestBody.userFlowType = "signUpOrSignIn";
requestBody.userFlowTypeVersion = 3;
requestBody.identityProviders = [
			new IdentityProvider();
requestBody.identityProviders.additionalData = new Map([
					["id", "Facebook-OAuth"];
				]);
		]
	],
const headers = {
	"Location": "https://graph.microsoft.com/beta/identity/b2cUserFlows('B2C_1_Customer')",
};
const result = async () => {
	await graphServiceClient.identity.b2cUserFlows.post(requestBody, headers);
}


```