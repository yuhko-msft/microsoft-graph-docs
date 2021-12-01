---
description: "Automatically generated file. DO NOT MODIFY"
---

```go

//THE GO SDK IS IN PREVIEW. NON-PRODUCTION USE ONLY
graphClient := msgraphsdk.NewGraphServiceClient(requestAdapter)

requestParameters := &msgraphsdk.AccessPackageResourceRolesRequestBuilderGetQueryParameters{
	Filter: "(originSystem+eq+%27SharePointOnline%27+and+accessPackageResource/id+eq+%2753c71803-a0a8-4777-aecc-075de8ee3991%27)",
	Select: "displayName,originId",
}
options := &msgraphsdk.AccessPackageResourceRolesRequestBuilderGetOptions{
	Q: requestParameters,
}
accessPackageCatalogId := "accessPackageCatalog-id"
result, err := graphClient.IdentityGovernance().EntitlementManagement().AccessPackageCatalogsById(&accessPackageCatalogId).AccessPackageResourceRoles().Get(options)


```