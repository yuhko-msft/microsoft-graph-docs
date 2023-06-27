---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphteams "github.com/microsoftgraph/msgraph-beta-sdk-go/teams"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphteams.TeamItemInstalledAppItemRequestBuilderGetQueryParameters{
	Select: [] string {"consentedPermissionSet","id"},
}
configuration := &graphteams.TeamItemInstalledAppItemRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Teams().ByTeamId("team-id").InstalledApps().ByInstalledAppId("teamsAppInstallation-id").Get(context.Background(), configuration)


```