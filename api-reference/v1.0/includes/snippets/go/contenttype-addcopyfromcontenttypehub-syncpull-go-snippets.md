---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphsites "github.com/microsoftgraph/msgraph-sdk-go/sites"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphsites.NewAddCopyFromContentTypeHubPostRequestBody()
contentTypeId := "0x0101"
requestBody.SetContentTypeId(&contentTypeId) 

result, err := graphClient.Sites().BySiteId("site-id").Lists().ByListId("list-id").ContentTypes().AddCopyFromContentTypeHub().Post(context.Background(), requestBody, nil)


```