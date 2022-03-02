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
const contenttypeinfo = new ContentTypeInfo();
contenttypeinfo.additionalData = new Map<string, unknown>([
						["id", "0x0101"],
						["name", "Document"]
					]);
requestBody.documentSet.allowedContentTypes = [
				contenttypeinfo
			]
const documentsetcontent = new DocumentSetContent();
documentsetcontent.additionalData = new Map<string, unknown>([
						["fileName", "a.txt"],
							 ["id" , "0x0101"],
					]);
const documentsetcontent1 = new DocumentSetContent();
documentsetcontent1.additionalData = new Map<string, unknown>([
						["fileName", "b.txt"],
							 ["id" , "0x0101"],
					]);
requestBody.documentSet.defaultContents = [
				documentsetcontent,
				documentsetcontent1
			]
const columndefinition = new ColumnDefinition();
columndefinition.additionalData = new Map<string, unknown>([
						["name", "Description"],
						["id", "cbb92da4-fd46-4c7d-af6c-3128c2a5576e"]
					]);
const columndefinition1 = new ColumnDefinition();
columndefinition1.additionalData = new Map<string, unknown>([
						["name", "Address"],
						["id", "fc2e188e-ba91-48c9-9dd3-16431afddd50"]
					]);
requestBody.documentSet.sharedColumns = [
				columndefinition,
				columndefinition1
			]
const columndefinition = new ColumnDefinition();
columndefinition.additionalData = new Map<string, unknown>([
						["name", "Address"],
						["id", "fc2e188e-ba91-48c9-9dd3-16431afddd50"]
					]);
requestBody.documentSet.welcomePageColumns = [
				columndefinition
			]
async () => {
	await graphServiceClient.sitesById("site-id").contentTypesById("contentType-id").patch(requestBody);
}


```