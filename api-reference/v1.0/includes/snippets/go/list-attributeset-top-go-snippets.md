---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphdirectory "github.com/microsoftgraph/msgraph-sdk-go/directory"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



requestTop := int32(10)

requestParameters := &graphdirectory.DirectoryAttributeSetsRequestBuilderGetQueryParameters{
	Top: &requestTop,
}
configuration := &graphdirectory.DirectoryAttributeSetsRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Directory().AttributeSets().Get(context.Background(), configuration)


```