---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphmodels "github.com/microsoftgraph/msgraph-sdk-go/models"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphmodels.NewAccessPackageCatalog()
displayName := "Catalog One"
requestBody.SetDisplayName(&displayName) 

result, err := graphClient.IdentityGovernance().EntitlementManagement().Catalogs().ByCatalogId("accessPackageCatalog-id").Patch(context.Background(), requestBody, nil)


```