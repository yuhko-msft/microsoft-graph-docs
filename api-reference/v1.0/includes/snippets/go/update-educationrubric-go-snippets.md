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


requestBody := graphmodels.NewEducationRubric()
displayName := "Example Credit Rubric after display name patch"
requestBody.SetDisplayName(&displayName) 

result, err := graphClient.Education().Me().Rubrics().ByRubricId("educationRubric-id").Patch(context.Background(), requestBody, nil)


```