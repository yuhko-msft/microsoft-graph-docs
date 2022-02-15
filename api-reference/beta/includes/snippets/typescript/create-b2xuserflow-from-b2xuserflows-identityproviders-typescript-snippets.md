---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new B2xIdentityUserFlow()
requestBody.id = "Partner";
requestBody.userFlowType = "signUpOrSignIn";
requestBody.userFlowTypeVersion = 1;
requestBody.identityProviders = [
			new IdentityProvider();
requestBody.identityProviders.additionalData = new Map([
					["id", "Facebook-OAuth"];
					["type", "Facebook"];
					["name", "Facebook"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.identity.b2xUserFlows.post(requestBody);
}


```