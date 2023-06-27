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


requestBody := graphmodels.NewMeetingRegistrationQuestion()
answerInputType := graphmodels.RADIOBUTTON_ANSWERINPUTTYPE 
requestBody.SetAnswerInputType(&answerInputType) 
answerOptions := []string {
	"Software Engineer",
	"Software Development Manager",
	"Product Manager",
	"Data scientist",
	"Other",
}
requestBody.SetAnswerOptions(answerOptions)

result, err := graphClient.Me().OnlineMeetings().ByOnlineMeetingId("onlineMeeting-id").Registration().CustomQuestions().ByCustomQuestionId("meetingRegistrationQuestion-id").Patch(context.Background(), requestBody, nil)


```