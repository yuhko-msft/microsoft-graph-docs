---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  grapheducation "github.com/microsoftgraph/msgraph-sdk-go/education"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &grapheducation.EducationUserItemAssignmentsRequestBuilderGetQueryParameters{
	Expand: [] string {"submissions"},
}
configuration := &grapheducation.EducationUserItemAssignmentsRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Education().Users().ByUserId("educationUser-id").Assignments().Get(context.Background(), configuration)


```