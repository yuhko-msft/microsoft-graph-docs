---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new SchemaExtension()
requestBody.owner = "ef4cb9a8-97c3-4ca7-854b-5cb5ced376fa";
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
			new ExtensionSchemaProperty();
requestBody.properties.additionalData = new Map([
					["name", "courseSupervisors"];
					["type", "String"];
				]);
		]
	],
async () => {
	await graphServiceClient.schemaExtensionsById("schemaExtension-id").patch(requestBody);
}


```