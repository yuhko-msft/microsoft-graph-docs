---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphmodelssecurity "github.com/microsoftgraph/msgraph-beta-sdk-go/models/security"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphmodelssecurity.NewEmailThreatSubmissionPolicy()
isReportToMicrosoftEnabled := true
requestBody.SetIsReportToMicrosoftEnabled(&isReportToMicrosoftEnabled) 

result, err := graphClient.Security().ThreatSubmission().EmailThreatSubmissionPolicies().Post(context.Background(), requestBody, nil)


```