---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphreports "github.com/microsoftgraph/msgraph-beta-sdk-go/reports"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



requestFormat := "application/json"

requestParameters := &graphreports.ReportsGetM365AppUserDetail(period='{period}')RequestBuilderGetQueryParameters{
	Format: &requestFormat,
}
configuration := &graphreports.ReportsGetM365AppUserDetail(period='{period}')RequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

graphClient.Reports().GetM365AppUserDetail(period='{period}')().Get(context.Background(), configuration)


```