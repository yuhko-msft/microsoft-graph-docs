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


requestBody := graphmodels.NewContactMergeSuggestions()
isEnabled := false
requestBody.SetIsEnabled(&isEnabled) 

result, err := graphClient.Me().Settings().ContactMergeSuggestions().Patch(context.Background(), requestBody, nil)


```