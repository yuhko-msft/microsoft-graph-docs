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



result, err := graphClient.Admin().Windows().Updates().UpdatePolicies().ByUpdatePolicieId("updatePolicy-id").ComplianceChanges().ByComplianceChangeId("complianceChange-id").Get(context.Background(), nil)


```