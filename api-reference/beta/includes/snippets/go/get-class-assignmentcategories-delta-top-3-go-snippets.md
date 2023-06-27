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



requestTop := int32(3)

requestParameters := &grapheducation.EducationClasseItemAssignmentCategoriesDelta()RequestBuilderGetQueryParameters{
	Top: &requestTop,
}
configuration := &grapheducation.EducationClasseItemAssignmentCategoriesDelta()RequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Education().Classes().ByClasseId("educationClass-id").AssignmentCategories().Delta().Get(context.Background(), configuration)


```