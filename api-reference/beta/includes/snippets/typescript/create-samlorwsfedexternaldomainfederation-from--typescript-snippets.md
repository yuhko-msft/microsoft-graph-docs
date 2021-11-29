---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new IdentityProviderBase()
requestBody.displayName = "contoso display name";
requestBody.additionalData = new Map([
		["@odata.type", "microsoft.graph.samlOrWsFedExternalDomainFederation"];
		["issuerUri", "https://contoso.com/issuerUri"];
		["metadataExchangeUri", "https://contoso.com/metadataExchangeUri"];
		["passiveSignInUri", "https://contoso.com/signin"];
		["preferredAuthenticationProtocol", "wsFed"];
		["domains", [
					 ["@odata.type" , "microsoft.graph.externalDomainName"],
					 ["id" , "contoso.com"],
			]
		],
		["signingCertificate", "MIIDADCCAeigAwIBAgIQEX41y8r6"];
	]);
const result = async () => {
	await graphServiceClient.directory.federationConfigurations.post(requestBody);
}


```