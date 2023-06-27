---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphmodels "github.com/microsoftgraph/msgraph-sdk-go/models"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphmodels.NewDelegatedAdminRelationshipRequest()
action := graphmodels.LOCKFORAPPROVAL_DELEGATEDADMINRELATIONSHIPREQUESTACTION 
requestBody.SetAction(&action) 

result, err := graphClient.TenantRelationships().DelegatedAdminRelationships().ByDelegatedAdminRelationshipId("delegatedAdminRelationship-id").Requests().Post(context.Background(), requestBody, nil)


```