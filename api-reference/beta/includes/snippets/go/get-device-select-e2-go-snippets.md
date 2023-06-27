---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphdevices "github.com/microsoftgraph/msgraph-beta-sdk-go/devices"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphdevices.DeviceItemRequestBuilderGetQueryParameters{
	Select: [] string {"id","extensionAttributes"},
}
configuration := &graphdevices.DeviceItemRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Devices().ByDeviceId("device-id").Get(context.Background(), configuration)


```