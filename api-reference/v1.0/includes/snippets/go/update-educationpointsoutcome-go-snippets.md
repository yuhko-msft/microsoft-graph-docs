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


requestBody := graphmodels.NewEducationOutcome()
points := graphmodels.NewEducationAssignmentPointsGrade()
points := float32(85.0)
points.SetPoints(&points) 
requestBody.SetPoints(points)

result, err := graphClient.Education().Classes().ByClasseId("educationClass-id").Assignments().ByAssignmentId("educationAssignment-id").Submissions().BySubmissionId("educationSubmission-id").Outcomes().ByOutcomeId("educationOutcome-id").Patch(context.Background(), requestBody, nil)


```