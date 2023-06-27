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
ownerAppIds := []string {
	"44109254-4b2b-7a33-76ee-c890a167b295",
	"13eb9d8b-1d63-4153-9417-3a69ab200a78",
}
requestBody.SetOwnerAppIds(ownerAppIds)

result, err := graphClient.Solutions().BusinessScenarios().ByBusinessScenarioId("businessScenario-id").Patch(context.Background(), requestBody, nil)


```