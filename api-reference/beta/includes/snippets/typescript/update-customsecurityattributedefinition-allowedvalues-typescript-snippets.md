---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new CustomSecurityAttributeDefinition()
requestBody.additionalData = new Map([
		["allowedValues@delta", [
					 ["id" , "Baker"],
					 ["isActive" , false],
					 ["id" , "Skagit"],
					 ["isActive" , true],
			]
		],
	]);
const headers = {
	"OData-Version": "4.01",
};
async () => {
	await graphServiceClient.directory.customSecurityAttributeDefinitionsById("customSecurityAttributeDefinition-id").patch(requestBody, headers);
}


```