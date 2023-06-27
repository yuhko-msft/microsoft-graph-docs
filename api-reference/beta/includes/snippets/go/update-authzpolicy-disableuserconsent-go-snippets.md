---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphmodels "github.com/microsoftgraph/msgraph-beta-sdk-go/models"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphmodels.NewAuthorizationPolicy()
permissionGrantPolicyIdsAssignedToDefaultUserRole := []string {

}
requestBody.SetPermissionGrantPolicyIdsAssignedToDefaultUserRole(permissionGrantPolicyIdsAssignedToDefaultUserRole)

result, err := graphClient.Policies().AuthorizationPolicy().ByAuthorizationPolicy().Id("authorizationPolicy-id").Patch(context.Background(), requestBody, nil)


```