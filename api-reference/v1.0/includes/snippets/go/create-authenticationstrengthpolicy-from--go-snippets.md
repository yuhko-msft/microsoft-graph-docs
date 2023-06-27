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


requestBody := graphmodels.NewAuthenticationStrengthPolicy()
displayName := "Contoso authentication level"
requestBody.SetDisplayName(&displayName) 
description := "The only authentication level allowed to access our secret apps"
requestBody.SetDescription(&description) 
allowedCombinations := []graphmodels.AuthenticationMethodModesable {
	authenticationMethodModes := graphmodels.PASSWORD, HARDWAREOATH_AUTHENTICATIONMETHODMODES 
	requestBody.SetAuthenticationMethodModes(&authenticationMethodModes) 
	authenticationMethodModes := graphmodels.PASSWORD, SMS_AUTHENTICATIONMETHODMODES 
	requestBody.SetAuthenticationMethodModes(&authenticationMethodModes)
}
requestBody.SetAllowedCombinations(allowedCombinations)

result, err := graphClient.Policies().AuthenticationStrengthPolicies().Post(context.Background(), requestBody, nil)


```