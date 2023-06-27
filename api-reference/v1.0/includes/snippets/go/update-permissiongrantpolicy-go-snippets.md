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


requestBody := graphmodels.NewPermissionGrantPolicy()
displayName := "Custom permission grant policy"
requestBody.SetDisplayName(&displayName) 

result, err := graphClient.Policies().PermissionGrantPolicies().ByPermissionGrantPolicieId("permissionGrantPolicy-id").Patch(context.Background(), requestBody, nil)


```