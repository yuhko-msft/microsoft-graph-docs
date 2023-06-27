---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphapplications "github.com/microsoftgraph/msgraph-sdk-go/applications"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



requestSearch := "\"displayName:Browser\""

requestParameters := &graphapplications.ApplicationsRequestBuilderGetQueryParameters{
	Search: &requestSearch,
}
configuration := &graphapplications.ApplicationsRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Applications().Get(context.Background(), configuration)


```