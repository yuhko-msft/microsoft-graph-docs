---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  abstractions "github.com/microsoft/kiota-abstractions-go"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphusers "github.com/microsoftgraph/msgraph-beta-sdk-go/users"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


headers := abstractions.NewRequestHeaders()
headers.Add("Prefer", "outlook.body-content-type=\"text\"")

requestParameters := &graphusers.ItemMessagesRequestBuilderGetQueryParameters{
	Select: [] string {"subject","body","bodyPreview","uniqueBody"},
}
configuration := &graphusers.ItemMessagesRequestBuilderGetRequestConfiguration{
	Headers: headers,
	QueryParameters: requestParameters,
}

result, err := graphClient.Me().Messages().Get(context.Background(), configuration)


```