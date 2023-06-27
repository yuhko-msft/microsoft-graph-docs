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


requestBody := graphmodels.NewEducationCategory()
displayName := "Quizzes"
requestBody.SetDisplayName(&displayName) 

result, err := graphClient.Education().Classes().ByClasseId("educationClass-id").AssignmentCategories().Post(context.Background(), requestBody, nil)


```