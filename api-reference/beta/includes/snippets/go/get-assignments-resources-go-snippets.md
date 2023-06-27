---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  grapheducation "github.com/microsoftgraph/msgraph-beta-sdk-go/education"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &grapheducation.EducationClasseItemAssignmentsRequestBuilderGetQueryParameters{
	Expand: [] string {"resources"},
}
configuration := &grapheducation.EducationClasseItemAssignmentsRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Education().Classes().ByClasseId("educationClass-id").Assignments().Get(context.Background(), configuration)


```