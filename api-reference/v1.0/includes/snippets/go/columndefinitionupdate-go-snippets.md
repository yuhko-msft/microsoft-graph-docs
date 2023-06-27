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


requestBody := graphmodels.NewColumnDefinition()
required := true
requestBody.SetRequired(&required) 
hidden := false
requestBody.SetHidden(&hidden) 
propagateChanges := false
requestBody.SetPropagateChanges(&propagateChanges) 

result, err := graphClient.Sites().BySiteId("site-id").ContentTypes().ByContentTypeId("contentType-id").Columns().ByColumnId("columnDefinition-id").Patch(context.Background(), requestBody, nil)


```