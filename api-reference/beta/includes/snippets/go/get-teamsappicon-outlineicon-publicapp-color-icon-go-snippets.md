---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



result, err := graphClient.AppCatalogs().TeamsApps().ByTeamsAppId("teamsApp-id").AppDefinitions().ByAppDefinitionId("teamsAppDefinition-id").ColorIcon().Get(context.Background(), nil)


```