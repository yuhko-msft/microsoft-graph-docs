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


requestBody := graphmodels.NewIdentityProviderBase()
displayName := "Apple"
requestBody.SetDisplayName(&displayName) 

result, err := graphClient.Identity().IdentityProviders().ByIdentityProviderId("identityProviderBase-id").Patch(context.Background(), requestBody, nil)


```