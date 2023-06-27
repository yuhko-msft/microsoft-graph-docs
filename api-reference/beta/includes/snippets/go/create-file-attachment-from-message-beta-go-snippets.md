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


requestBody := graphmodels.NewAttachment()
name := "smile"
requestBody.SetName(&name) 
contentBytes := []byte("a0b1c76de9f7=")
requestBody.SetContentBytes(&contentBytes) 

result, err := graphClient.Me().Messages().ByMessageId("message-id").Attachments().Post(context.Background(), requestBody, nil)


```