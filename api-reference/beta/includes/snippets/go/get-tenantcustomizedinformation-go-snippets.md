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



result, err := graphClient.TenantRelationships().ManagedTenants().TenantsCustomizedInformation().ByTenantsCustomizedInformation().Id("tenantCustomizedInformation-id").Get(context.Background(), nil)


```