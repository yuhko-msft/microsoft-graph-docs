---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



graphClient.External().Connections().ByConnectionId("externalConnection-id").Groups().ByGroupId("externalGroup-id").Members().ByMemberId("identity-id").Delete(context.Background(), nil)


```