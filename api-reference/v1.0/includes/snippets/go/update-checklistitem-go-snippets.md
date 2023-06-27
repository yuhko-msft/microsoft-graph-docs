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


requestBody := graphmodels.NewChecklistItem()
displayName := "buy cake"
requestBody.SetDisplayName(&displayName) 

result, err := graphClient.Me().Todo().Lists().ByListId("todoTaskList-id").Tasks().ByTaskId("todoTask-id").ChecklistItems().ByChecklistItemId("checklistItem-id").Patch(context.Background(), requestBody, nil)


```