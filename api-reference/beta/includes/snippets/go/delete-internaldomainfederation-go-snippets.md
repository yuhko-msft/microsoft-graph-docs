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



graphClient.Domains().ByDomainId("domain-id").FederationConfiguration().ByFederationConfiguration().Id("internalDomainFederation-id").Delete(context.Background(), nil)


```