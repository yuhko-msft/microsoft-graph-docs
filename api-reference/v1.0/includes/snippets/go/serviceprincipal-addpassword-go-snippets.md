---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphserviceprincipals "github.com/microsoftgraph/msgraph-sdk-go/serviceprincipals"
	  graphmodels "github.com/microsoftgraph/msgraph-sdk-go/models"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphserviceprincipals.NewAddPasswordPostRequestBody()
passwordCredential := graphmodels.NewPasswordCredential()
displayName := "Password friendly name"
passwordCredential.SetDisplayName(&displayName) 
requestBody.SetPasswordCredential(passwordCredential)

result, err := graphClient.ServicePrincipals().ByServicePrincipalId("servicePrincipal-id").AddPassword().Post(context.Background(), requestBody, nil)


```