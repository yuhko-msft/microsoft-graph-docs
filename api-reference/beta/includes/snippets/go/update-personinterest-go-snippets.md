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


requestBody := graphmodels.NewPersonInterest()
categories := []string {
	"Sports",
}
requestBody.SetCategories(categories)

result, err := graphClient.Me().Profile().Interests().ByInterestId("personInterest-id").Patch(context.Background(), requestBody, nil)


```