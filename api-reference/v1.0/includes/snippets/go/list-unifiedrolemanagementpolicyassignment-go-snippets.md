---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphpolicies "github.com/microsoftgraph/msgraph-sdk-go/policies"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



requestFilter := "scopeId eq '/' and scopeType eq 'Directory'"

requestParameters := &graphpolicies.PoliciesRoleManagementPolicyAssignmentsRequestBuilderGetQueryParameters{
	Filter: &requestFilter,
}
configuration := &graphpolicies.PoliciesRoleManagementPolicyAssignmentsRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Policies().RoleManagementPolicyAssignments().Get(context.Background(), configuration)


```