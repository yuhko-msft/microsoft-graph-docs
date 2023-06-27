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


requestBody := graphmodels.NewOrganizationalBrandingLocalization()
backgroundColor := "#00000F"
requestBody.SetBackgroundColor(&backgroundColor) 
signInPageText := "Welcome to Contoso France"
requestBody.SetSignInPageText(&signInPageText) 

result, err := graphClient.Organization().ByOrganization().Id("organization-id").Branding().Localizations().ByLocalizationId("organizationalBrandingLocalization-id").Patch(context.Background(), requestBody, nil)


```