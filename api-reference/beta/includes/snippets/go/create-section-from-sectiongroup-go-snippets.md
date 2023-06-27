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


requestBody := graphmodels.NewOnenoteSection()
displayName := "Section name"
requestBody.SetDisplayName(&displayName) 

result, err := graphClient.Me().Onenote().SectionGroups().BySectionGroupId("sectionGroup-id").Sections().Post(context.Background(), requestBody, nil)


```