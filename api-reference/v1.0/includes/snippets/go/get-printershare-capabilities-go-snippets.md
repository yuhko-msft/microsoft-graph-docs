---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphprint "github.com/microsoftgraph/msgraph-sdk-go/print"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphprint.PrintShareItemRequestBuilderGetQueryParameters{
	Select: [] string {"id","displayName","capabilities"},
}
configuration := &graphprint.PrintShareItemRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Print().Shares().ByShareId("printerShare-id").Get(context.Background(), configuration)


```