---
description: "Automatically generated file. DO NOT MODIFY"
---

```go

//THE GO SDK IS IN PREVIEW. NON-PRODUCTION USE ONLY
graphClient := msgraphsdk.NewGraphServiceClient(requestAdapter)

requestBody := msgraphsdk.NewMeetingRegistrant()
id := "30494ab7-7338-4592-bfec-a4333be2a0a6"
requestBody.SetId(&id)
requestBody.SetAdditionalData(map[string]interface{}{
	"@odata.type": "#microsoft.graph.externalMeetingRegistrant",
	"tenantId": "909c6581-5130-43e9-88f3-fcb3582cde37",
	"userId": "cc515404-b55c-466e-b896-992c918ecc01",
}
options := &msgraphsdk.RegistrantsRequestBuilderPostOptions{
	Body: requestBody,
}
onlineMeetingId := "onlineMeeting-id"
result, err := graphClient.Me().OnlineMeetingsById(&onlineMeetingId).Registration().Registrants().Post(options)


```