---
description: "Automatically generated file. DO NOT MODIFY"
---

```go

//THE GO SDK IS IN PREVIEW. NON-PRODUCTION USE ONLY
graphClient := msgraphsdk.NewGraphServiceClient(requestAdapter)

requestBody := msgraphsdk.NewMeetingRegistrant()
id := "9d96988d-a66a-46ce-aad7-0b245615b297"
requestBody.SetId(&id)
requestBody.SetAdditionalData(map[string]interface{}{
	"@odata.type": "#microsoft.graph.externalMeetingRegistrant",
}
options := &msgraphsdk.RegistrantsRequestBuilderPostOptions{
	Body: requestBody,
}
onlineMeetingId := "onlineMeeting-id"
result, err := graphClient.Me().OnlineMeetingsById(&onlineMeetingId).Registration().Registrants().Post(options)


```