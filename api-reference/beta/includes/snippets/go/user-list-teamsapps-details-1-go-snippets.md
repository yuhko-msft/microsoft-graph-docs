---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphusers "github.com/microsoftgraph/msgraph-beta-sdk-go/users"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphusers.UserItemTeamworkInstalledAppItemRequestBuilderGetQueryParameters{
	Expand: [] string {"teamsAppDefinition"},
}
configuration := &graphusers.UserItemTeamworkInstalledAppItemRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Users().ByUserId("user-id").Teamwork().InstalledApps().ByInstalledAppId("userScopeTeamsAppInstallation-id").Get(context.Background(), configuration)


```