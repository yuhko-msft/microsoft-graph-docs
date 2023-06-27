---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphadmin "github.com/microsoftgraph/msgraph-beta-sdk-go/admin"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphadmin.AdminServiceAnnouncementHealthOverviewItemRequestBuilderGetQueryParameters{
	Expand: [] string {"issues"},
}
configuration := &graphadmin.AdminServiceAnnouncementHealthOverviewItemRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Admin().ServiceAnnouncement().HealthOverviews().ByHealthOverviewId("serviceHealth-id").Get(context.Background(), configuration)


```