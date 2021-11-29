---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessPackageResourceRequest()
requestBody.catalogId = "26ac0c0a-08bc-4a7b-a313-839f58044ba5";
requestBody.requestType = "AdminAdd";
requestBody.justification = "";
requestBody.accessPackageResource = new AccessPackageResource();
requestBody.accessPackageResource.additionalData = new Map([
			["displayName", "Sales"];
			["description", "https://contoso.sharepoint.com/sites/Sales"];
			["url", "https://contoso.sharepoint.com/sites/Sales"];
			["resourceType", "SharePoint Online Site"];
			["originId", "https://contoso.sharepoint.com/sites/Sales"];
			["originSystem", "SharePointOnline"];
		]);
const result = async () => {
	await graphServiceClient.identityGovernance.entitlementManagement.accessPackageResourceRequests.post(requestBody);
}


```