---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  abstractions "github.com/microsoft/kiota-abstractions-go"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphserviceprincipals "github.com/microsoftgraph/msgraph-beta-sdk-go/serviceprincipals"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


headers := abstractions.NewRequestHeaders()
headers.Add("Authorization", "Bearer {Token}")

configuration := &graphserviceprincipals.ServicePrincipalItemSynchronizationJobsRequestBuilderGetRequestConfiguration{
	Headers: headers,
}

result, err := graphClient.ServicePrincipals().ByServicePrincipalId("servicePrincipal-id").Synchronization().Jobs().Get(context.Background(), configuration)


```