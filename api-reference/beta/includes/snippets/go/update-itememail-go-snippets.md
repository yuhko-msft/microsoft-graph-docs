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


requestBody := graphmodels.NewItemEmail()
displayName := "Business Email"
requestBody.SetDisplayName(&displayName) 
type := graphmodels.WORK_EMAILTYPE 
requestBody.SetType(&type) 

result, err := graphClient.Users().ByUserId("user-id").Profile().Emails().ByEmailId("itemEmail-id").Patch(context.Background(), requestBody, nil)


```