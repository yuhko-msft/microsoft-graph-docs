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


requestBody := graphmodels.NewOutlookCategory()
color := graphmodels.PRESET15_CATEGORYCOLOR 
requestBody.SetColor(&color) 

result, err := graphClient.Me().Outlook().MasterCategories().ByMasterCategorieId("outlookCategory-id").Patch(context.Background(), requestBody, nil)


```