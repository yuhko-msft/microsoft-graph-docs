---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphmodels "github.com/microsoftgraph/msgraph-beta-sdk-go/models"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphmodels.NewBusinessScenario()
displayName := "Contoso Order Tracking"
requestBody.SetDisplayName(&displayName) 
uniqueName := "com.contoso.apps.ordertracking"
requestBody.SetUniqueName(&uniqueName) 

result, err := graphClient.Solutions().BusinessScenarios().Post(context.Background(), requestBody, nil)


```