---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



graphClient.Devices().ByDeviceId("device-id").RegisteredOwners().ByRegisteredOwnerId("directoryObject-id").Ref().Delete(context.Background(), nil)


```