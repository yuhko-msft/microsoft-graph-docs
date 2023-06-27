---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphshares "github.com/microsoftgraph/msgraph-sdk-go/shares"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphshares.ShareItemDriveItemRequestBuilderGetQueryParameters{
	Expand: [] string {"children"},
}
configuration := &graphshares.ShareItemDriveItemRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Shares().ByShareId("sharedDriveItem-id").DriveItem().Get(context.Background(), configuration)


```