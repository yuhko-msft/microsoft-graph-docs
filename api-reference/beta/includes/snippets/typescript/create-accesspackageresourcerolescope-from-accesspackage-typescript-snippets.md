---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessPackageResourceRoleScope()
requestBody.accessPackageResourceRole = new AccessPackageResourceRole();
requestBody.accessPackageResourceRole.additionalData = new Map([
			["originId", "Member_b31fe1f1-3651-488f-bd9a-1711887fd4ca"];
			["displayName", "Member"];
			["originSystem", "AadGroup"];
				 ["id" , "1d08498d-72a1-403f-8511-6b1f875746a0"],
				 ["resourceType" , "O365 Group"],
				 ["originId" , "b31fe1f1-3651-488f-bd9a-1711887fd4ca"],
				 ["originSystem" , "AadGroup"],
		]);
requestBody.accessPackageResourceScope = new AccessPackageResourceScope();
requestBody.accessPackageResourceScope.additionalData = new Map([
			["originId", "b31fe1f1-3651-488f-bd9a-1711887fd4ca"];
			["originSystem", "AadGroup"];
		]);
const result = async () => {
	await graphServiceClient.identityGovernance.entitlementManagement.accessPackagesById("accessPackage-id").accessPackageResourceRoleScopes.post(requestBody);
}


```