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


requestBody := graphmodels.NewEducationClass()
description := "History - World History 1"
requestBody.SetDescription(&description) 
displayName := "World History Level 1"
requestBody.SetDisplayName(&displayName) 

result, err := graphClient.Education().Classes().ByClasseId("educationClass-id").Patch(context.Background(), requestBody, nil)


```