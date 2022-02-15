---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new NoncustodialDataSource()
requestBody.applyHoldToSource = false;
requestBody.dataSource = new DataSource();
requestBody.dataSource.additionalData = new Map([
			["@odata.type", "microsoft.graph.ediscovery.siteSource"];
				 ["webUrl" , "https://contoso.sharepoint.com/sites/SecretSite"],
		]);
const result = async () => {
	await graphServiceClient.compliance.ediscovery.casesById("case-id").noncustodialDataSources.post(requestBody);
}


```