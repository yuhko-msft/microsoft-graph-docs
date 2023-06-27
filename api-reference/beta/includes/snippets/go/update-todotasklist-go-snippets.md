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


requestBody := graphmodels.NewTodoTaskList()
displayName := "Vacation Plan"
requestBody.SetDisplayName(&displayName) 

result, err := graphClient.Me().Todo().Lists().ByListId("todoTaskList-id").Patch(context.Background(), requestBody, nil)


```