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



result, err := graphClient.Users().ByUserId("user-id").Authentication().WindowsHelloForBusinessMethods().ByWindowsHelloForBusinessMethodId("windowsHelloForBusinessAuthenticationMethod-id").Get(context.Background(), nil)


```