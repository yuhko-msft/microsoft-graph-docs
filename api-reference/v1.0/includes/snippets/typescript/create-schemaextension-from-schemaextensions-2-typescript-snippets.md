---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new SchemaExtension()
requestBody.id = "courses";
requestBody.description = "Graph Learn training courses extensions";
requestBody.targetTypes = [
			"Group";
		]
	],
requestBody.properties = [
			new ExtensionSchemaProperty();
requestBody.properties.additionalData = new Map([
					["name", "courseId"];
					["type", "Integer"];
				]);
			new ExtensionSchemaProperty();
requestBody.properties.additionalData = new Map([
					["name", "courseName"];
					["type", "String"];
				]);
			new ExtensionSchemaProperty();
requestBody.properties.additionalData = new Map([
					["name", "courseType"];
					["type", "String"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.schemaExtensions.post(requestBody);
}


```