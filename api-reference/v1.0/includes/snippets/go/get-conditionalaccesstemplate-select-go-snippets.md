---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphidentity "github.com/microsoftgraph/msgraph-sdk-go/identity"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphidentity.IdentityConditionalAccessTemplateItemRequestBuilderGetQueryParameters{
	Select: [] string {"details"},
}
configuration := &graphidentity.IdentityConditionalAccessTemplateItemRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Identity().ConditionalAccess().Templates().ByTemplateId("conditionalAccessTemplate-id").Get(context.Background(), configuration)


```