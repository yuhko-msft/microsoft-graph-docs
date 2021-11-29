---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.requests = [
			new SearchRequest();
requestBody.requests.additionalData = new Map([
					["entityTypes", [
							"externalItem";
						]
					],
					["contentSources", [
							"/external/connections/connectionfriendlyname";
						]
					],
						 ["queryString" , "contoso product"],
					["from", 0];
					["size", 25];
					["fields", [
							"title";
							"description";
						]
					],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.search.query.post(requestBody);
}


```