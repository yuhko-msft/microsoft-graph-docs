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


requestBody := graphmodels.NewAuthoredNote()
content := graphmodels.NewItemBody()
content := "String"
content.SetContent(&content) 
contentType := graphmodels.TEXT_BODYTYPE 
content.SetContentType(&contentType) 
requestBody.SetContent(content)

result, err := graphClient.Privacy().SubjectRightsRequests().BySubjectRightsRequestId("subjectRightsRequest-id").Notes().Post(context.Background(), requestBody, nil)


```