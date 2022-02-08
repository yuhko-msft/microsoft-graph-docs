---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new CustomSecurityAttributeDefinition()
requestBody.attributeSet = "Engineering";
requestBody.description = "Active projects for user";
requestBody.isCollection = true;
requestBody.isSearchable = true;
requestBody.name = "Project";
requestBody.status = "Available";
requestBody.type = "String";
requestBody.usePreDefinedValuesOnly = true;
requestBody.allowedValues = [
			new AllowedValue();
requestBody.allowedValues.additionalData = new Map([
					["id", "Alpine"];
					["isActive", true];
				]);
			new AllowedValue();
requestBody.allowedValues.additionalData = new Map([
					["id", "Baker"];
					["isActive", true];
				]);
			new AllowedValue();
requestBody.allowedValues.additionalData = new Map([
					["id", "Cascade"];
					["isActive", true];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.directory.customSecurityAttributeDefinitions.post(requestBody);
}


```