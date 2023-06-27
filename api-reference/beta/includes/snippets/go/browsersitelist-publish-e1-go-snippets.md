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


requestBody := graphadmin.NewPublishPostRequestBody()
revision := "1.0"
requestBody.SetRevision(&revision) 

result, err := graphClient.Admin().Edge().InternetExplorerMode().SiteLists().BySiteListId("browserSiteList-id").Publish().Post(context.Background(), requestBody, nil)


```