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


requestBody := graphmodels.NewPersonAnnotation()
allowedAudiences := graphmodels.ORGANIZATION_ALLOWEDAUDIENCES 
requestBody.SetAllowedAudiences(&allowedAudiences) 

result, err := graphClient.Users().ByUserId("user-id").Profile().Notes().ByNoteId("personAnnotation-id").Patch(context.Background(), requestBody, nil)


```