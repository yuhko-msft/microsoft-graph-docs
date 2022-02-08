---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new List()
requestBody.displayName = "Books";
requestBody.columns = [
			new ColumnDefinition();
requestBody.columns.additionalData = new Map([
					["name", "Author"];
				]);
			new ColumnDefinition();
requestBody.columns.additionalData = new Map([
					["name", "PageCount"];
				]);
		]
	],
requestBody.list = new ListInfo();
requestBody.list.template = "genericList";
const result = async () => {
	await graphServiceClient.sitesById("site-id").lists.post(requestBody);
}


```