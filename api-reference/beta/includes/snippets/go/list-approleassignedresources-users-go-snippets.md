---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  abstractions "github.com/microsoft/kiota-abstractions-go"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphusers "github.com/microsoftgraph/msgraph-beta-sdk-go/users"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


headers := abstractions.NewRequestHeaders()
headers.Add("ConsistencyLevel", "eventual")

requestParameters := &graphusers.ItemAppRoleAssignedResourcesRequestBuilderGetQueryParameters{
	Select: [] string {"displayName","accountEnabled","servicePrincipalType","signInAudience"},
}
configuration := &graphusers.ItemAppRoleAssignedResourcesRequestBuilderGetRequestConfiguration{
	Headers: headers,
	QueryParameters: requestParameters,
}

result, err := graphClient.Me().AppRoleAssignedResources().Get(context.Background(), configuration)


```