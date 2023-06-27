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


requestBody := graphmodels.NewOutlookTaskFolder()
name := "Cooking"
requestBody.SetName(&name) 

result, err := graphClient.Me().Outlook().TaskGroups().ByTaskGroupId("outlookTaskGroup-id").TaskFolders().Post(context.Background(), requestBody, nil)


```