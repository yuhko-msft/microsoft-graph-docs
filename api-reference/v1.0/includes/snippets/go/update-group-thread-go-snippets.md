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


requestBody := graphmodels.NewConversationThread()
additionalData := map[string]interface{}{
	"originalStartTimeZone" : "originalStartTimeZone-value", 
	"originalEndTimeZone" : "originalEndTimeZone-value", 
responseStatus := graphmodels.New()
response := ""
responseStatus.SetResponse(&response) 
time := "datetime-value"
responseStatus.SetTime(&time) 
	requestBody.SetResponseStatus(responseStatus)
	"iCalUId" : "iCalUId-value", 
	"reminderMinutesBeforeStart" : int32(99) , 
	isReminderOn := true
requestBody.SetIsReminderOn(&isReminderOn) 
}
requestBody.SetAdditionalData(additionalData)

result, err := graphClient.Groups().ByGroupId("group-id").Threads().ByThreadId("conversationThread-id").Patch(context.Background(), requestBody, nil)


```