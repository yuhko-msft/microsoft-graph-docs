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



result, err := graphClient.Planner().Rosters().ByRosterId("plannerRoster-id").Plans().ByPlanId("plannerPlan-id").Get(context.Background(), nil)


```