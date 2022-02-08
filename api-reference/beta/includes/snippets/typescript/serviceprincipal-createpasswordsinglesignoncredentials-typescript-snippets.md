---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.id = "5793aa3b-cca9-4794-679a240f8b58";
requestBody.credentials = [
			new Credential();
requestBody.credentials.additionalData = new Map([
					["fieldId", "param_username"];
					["value", "myusername"];
					["type", "username"];
				]);
			new Credential();
requestBody.credentials.additionalData = new Map([
					["fieldId", "param_password"];
					["value", "pa$$w0rd"];
					["type", "password"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.servicePrincipalsById("servicePrincipal-id").createPasswordSingleSignOnCredentials.post(requestBody);
}


```