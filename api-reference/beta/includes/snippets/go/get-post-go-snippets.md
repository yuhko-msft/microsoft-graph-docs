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



result, err := graphClient.Groups().ByGroupId("group-id").Threads().ByThreadId("conversationThread-id").Posts().ByPostId("post-id").Get(context.Background(), nil)


```