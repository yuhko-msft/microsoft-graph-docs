---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



result, err := graphClient.IdentityGovernance().EntitlementManagement().AccessPackageCatalogs().ByAccessPackageCatalogId("accessPackageCatalog-id").AccessPackageCustomWorkflowExtensions().Get(context.Background(), nil)


```