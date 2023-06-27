---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphmodels "github.com/microsoftgraph/msgraph-sdk-go/models"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphmodels.NewDevice()
accountEnabled := false
requestBody.SetAccountEnabled(&accountEnabled) 

result, err := graphClient.Devices().ByDeviceId("device-id").Patch(context.Background(), requestBody, nil)


```