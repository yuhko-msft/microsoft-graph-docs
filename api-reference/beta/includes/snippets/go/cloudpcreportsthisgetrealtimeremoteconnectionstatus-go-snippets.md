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



graphClient.DeviceManagement().VirtualEndpoint().Reports().GetRealTimeRemoteConnectionStatus(cloudPcId='{cloudPcId}')().Get(context.Background(), nil)


```