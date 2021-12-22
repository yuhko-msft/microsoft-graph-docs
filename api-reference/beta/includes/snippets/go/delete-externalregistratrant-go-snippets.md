---
description: "Automatically generated file. DO NOT MODIFY"
---

```go

//THE GO SDK IS IN PREVIEW. NON-PRODUCTION USE ONLY
graphClient := msgraphsdk.NewGraphServiceClient(requestAdapter)

onlineMeetingId := "onlineMeeting-id"
meetingRegistrantId := "meetingRegistrant-id"
graphClient.Me().OnlineMeetingsById(&onlineMeetingId).Registration().RegistrantsById(&meetingRegistrantId).Delete(nil)


```