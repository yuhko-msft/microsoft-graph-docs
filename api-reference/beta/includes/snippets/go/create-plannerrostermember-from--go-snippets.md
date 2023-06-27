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


requestBody := graphmodels.NewPlannerRosterMember()
userId := "String"
requestBody.SetUserId(&userId) 

result, err := graphClient.Planner().Rosters().ByRosterId("plannerRoster-id").Members().Post(context.Background(), requestBody, nil)


```