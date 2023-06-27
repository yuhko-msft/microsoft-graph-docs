---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphserviceprincipals "github.com/microsoftgraph/msgraph-beta-sdk-go/serviceprincipals"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphserviceprincipals.ServicePrincipalItemRequestBuilderGetQueryParameters{
	Select: [] string {"customSecurityAttributes"},
}
configuration := &graphserviceprincipals.ServicePrincipalItemRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.ServicePrincipals().ByServicePrincipalId("servicePrincipal-id").Get(context.Background(), configuration)


```