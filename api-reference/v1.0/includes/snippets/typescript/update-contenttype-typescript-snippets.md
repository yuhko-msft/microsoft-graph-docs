---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ContentType()
requestBody.name = "updatedCt";
requestBody.documentSet = new DocumentSet();
requestBody.documentSet.shouldPrefixNameToFile = true;
requestBody.documentSet.allowedContentTypes = [
				new ContentTypeInfo();
requestBody.documentSet.allowedContentTypes.additionalData = new Map([
						["id", "0x0101"];
						["name", "Document"];
					]);
			]
		],
requestBody.documentSet.defaultContents = [
				new DocumentSetContent();
requestBody.documentSet.defaultContents.additionalData = new Map([
						["fileName", "a.txt"];
							 ["id" , "0x0101"],
					]);
				new DocumentSetContent();
requestBody.documentSet.defaultContents.additionalData = new Map([
						["fileName", "b.txt"];
							 ["id" , "0x0101"],
					]);
			]
		],
requestBody.documentSet.sharedColumns = [
				new ColumnDefinition();
requestBody.documentSet.sharedColumns.additionalData = new Map([
						["name", "Description"];
						["id", "cbb92da4-fd46-4c7d-af6c-3128c2a5576e"];
					]);
				new ColumnDefinition();
requestBody.documentSet.sharedColumns.additionalData = new Map([
						["name", "Address"];
						["id", "fc2e188e-ba91-48c9-9dd3-16431afddd50"];
					]);
			]
		],
requestBody.documentSet.welcomePageColumns = [
				new ColumnDefinition();
requestBody.documentSet.welcomePageColumns.additionalData = new Map([
						["name", "Address"];
						["id", "fc2e188e-ba91-48c9-9dd3-16431afddd50"];
					]);
			]
		],
async () => {
	await graphServiceClient.sitesById("site-id").contentTypesById("contentType-id").patch(requestBody);
}


```