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


requestBody := graphmodels.NewTeamsAppInstallation()
additionalData := map[string]interface{}{
	"odataBind" : "https://graph.microsoft.com/beta/appCatalogs/teamsApps/12345678-9abc-def0-123456789a", 
}
requestBody.SetAdditionalData(additionalData)

result, err := graphClient.Teams().ByTeamId("team-id").InstalledApps().Post(context.Background(), requestBody, nil)


```