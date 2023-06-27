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



result, err := graphClient.Compliance().Ediscovery().Cases().ByCaseId("case-id").ReviewSets().ByReviewSetId("reviewSet-id").Queries().ByQuerieId("reviewSetQuery-id").Get(context.Background(), nil)


```