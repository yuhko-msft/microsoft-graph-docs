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


requestBody := graphmodels.NewOnenoteSection()
displayName := "Section name"
requestBody.SetDisplayName(&displayName) 

result, err := graphClient.Me().Onenote().Notebooks().ByNotebookId("notebook-id").Sections().Post(context.Background(), requestBody, nil)


```