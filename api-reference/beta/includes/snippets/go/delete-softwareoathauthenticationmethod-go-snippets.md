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



graphClient.Users().ByUserId("user-id").Authentication().SoftwareOathMethods().BySoftwareOathMethodId("softwareOathAuthenticationMethod-id").Delete(context.Background(), nil)


```