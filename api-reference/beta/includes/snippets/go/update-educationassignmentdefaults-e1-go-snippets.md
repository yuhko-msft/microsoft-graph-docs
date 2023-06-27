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


requestBody := graphmodels.NewEducationAssignmentDefaults()
addedStudentAction := graphmodels.ASSIGNIFOPEN_EDUCATIONADDEDSTUDENTACTION 
requestBody.SetAddedStudentAction(&addedStudentAction) 
addToCalendarAction := graphmodels.STUDENTSANDTEAMOWNERS_EDUCATIONADDTOCALENDAROPTIONS 
requestBody.SetAddToCalendarAction(&addToCalendarAction) 
notificationChannelUrl := "https://graph.microsoft.com/beta/teams('id')/channels('id')"
requestBody.SetNotificationChannelUrl(&notificationChannelUrl) 

result, err := graphClient.Education().Classes().ByClasseId("educationClass-id").AssignmentDefaults().Patch(context.Background(), requestBody, nil)


```