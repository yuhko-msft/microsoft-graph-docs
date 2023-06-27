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


requestBody := graphmodels.NewOAuth2PermissionGrant()
scope := "User.Read.All"
requestBody.SetScope(&scope) 

result, err := graphClient.Oauth2PermissionGrants().ByOauth2PermissionGrantId("oAuth2PermissionGrant-id").Patch(context.Background(), requestBody, nil)


```