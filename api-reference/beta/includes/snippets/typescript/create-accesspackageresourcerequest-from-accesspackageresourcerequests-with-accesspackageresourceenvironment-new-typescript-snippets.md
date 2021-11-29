---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessPackageResourceRequest()
requestBody.catalogId = "de9315c1-272b-4905-924b-cc112ca180c7";
requestBody.accessPackageResource = new AccessPackageResource();
requestBody.accessPackageResource.additionalData = new Map([
			["displayName", "Community Outreach"];
			["description", "https://contoso.sharepoint.com/sites/CSR"];
			["resourceType", "SharePoint Online Site"];
			["originId", "https://contoso.sharepoint.com/sites/CSR"];
			["originSystem", "SharePointOnline"];
				 ["originId" , "https://contoso-admin.sharepoint.com/"],
		]);
requestBody.requestType = "AdminAdd";
const result = async () => {
	await graphServiceClient.identityGovernance.entitlementManagement.accessPackageResourceRequests.post(requestBody);
}


```