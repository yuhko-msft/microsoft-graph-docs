---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphsecurity "github.com/microsoftgraph/msgraph-beta-sdk-go/security"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphsecurity.NewDeleteTiIndicatorsPostRequestBody()
value := []string {
	"id-value1",
	"id-value2",
}
requestBody.SetValue(value)

result, err := graphClient.Security().TiIndicators().DeleteTiIndicators().Post(context.Background(), requestBody, nil)


```