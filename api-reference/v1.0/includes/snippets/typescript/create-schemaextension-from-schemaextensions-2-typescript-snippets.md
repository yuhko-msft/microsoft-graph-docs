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
			"Group"
		]
const extensionschemaproperty = new ExtensionSchemaProperty();
extensionschemaproperty.additionalData = new Map<string, unknown>([
					["name", "courseId"],
					["type", "Integer"]
				]);
const extensionschemaproperty1 = new ExtensionSchemaProperty();
extensionschemaproperty1.additionalData = new Map<string, unknown>([
					["name", "courseName"],
					["type", "String"]
				]);
const extensionschemaproperty2 = new ExtensionSchemaProperty();
extensionschemaproperty2.additionalData = new Map<string, unknown>([
					["name", "courseType"],
					["type", "String"]
				]);
requestBody.properties = [
			extensionschemaproperty,
			extensionschemaproperty1,
			extensionschemaproperty2
		]
const result = async () => {
	await graphServiceClient.schemaExtensions.post(requestBody);
}


```