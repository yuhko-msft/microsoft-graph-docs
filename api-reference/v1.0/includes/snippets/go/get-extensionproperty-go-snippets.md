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



result, err := graphClient.Applications().ByApplicationId("application-id").ExtensionProperties().ByExtensionPropertieId("extensionProperty-id").Get(context.Background(), nil)


```