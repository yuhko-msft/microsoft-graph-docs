---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



result, err := graphClient.IdentityGovernance().AccessReviews().HistoryDefinitions().ByHistoryDefinitionId("accessReviewHistoryDefinition-id").Instances().ByInstanceId("accessReviewHistoryInstance-id").GenerateDownloadUri().Post(context.Background(), nil)


```