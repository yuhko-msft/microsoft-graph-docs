---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphgroups "github.com/microsoftgraph/msgraph-sdk-go/groups"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphgroups.GroupsDelta()RequestBuilderGetQueryParameters{
	Select: [] string {"displayName","description","members"},
}
configuration := &graphgroups.GroupsDelta()RequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Groups().Delta().Get(context.Background(), configuration)


```