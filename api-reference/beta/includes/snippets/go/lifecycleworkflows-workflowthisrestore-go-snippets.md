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



result, err := graphClient.IdentityGovernance().LifecycleWorkflows().DeletedItems().Workflows().ByWorkflowId("workflow-id").MicrosoftGraphIdentityGovernanceRestore().Post(context.Background(), nil)


```