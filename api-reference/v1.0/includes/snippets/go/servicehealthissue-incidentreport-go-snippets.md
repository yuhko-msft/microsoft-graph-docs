---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



graphClient.Admin().ServiceAnnouncement().Issues().ByIssueId("serviceHealthIssue-id").IncidentReport().Get(context.Background(), nil)


```