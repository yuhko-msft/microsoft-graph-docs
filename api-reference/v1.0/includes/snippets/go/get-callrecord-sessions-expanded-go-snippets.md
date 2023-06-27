---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphcommunications "github.com/microsoftgraph/msgraph-sdk-go/communications"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphcommunications.CommunicationsCallRecordItemSessionsRequestBuilderGetQueryParameters{
	Expand: [] string {"segments"},
}
configuration := &graphcommunications.CommunicationsCallRecordItemSessionsRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Communications().CallRecords().ByCallRecordId("callRecord-id").Sessions().Get(context.Background(), configuration)


```