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


requestBody := graphmodels.NewUser()
additionalData := map[string]interface{}{
customSecurityAttributes := graphmodels.New()
engineering := graphmodels.New()
	projectDate := null
engineering.SetProjectDate(&projectDate) 
	customSecurityAttributes.SetEngineering(engineering)
	requestBody.SetCustomSecurityAttributes(customSecurityAttributes)
}
requestBody.SetAdditionalData(additionalData)

result, err := graphClient.Users().ByUserId("user-id").Patch(context.Background(), requestBody, nil)


```