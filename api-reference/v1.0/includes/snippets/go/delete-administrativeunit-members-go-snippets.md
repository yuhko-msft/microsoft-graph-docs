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



graphClient.Directory().AdministrativeUnits().ByAdministrativeUnitId("administrativeUnit-id").Members().ByMemberId("directoryObject-id").Ref().Delete(context.Background(), nil)


```