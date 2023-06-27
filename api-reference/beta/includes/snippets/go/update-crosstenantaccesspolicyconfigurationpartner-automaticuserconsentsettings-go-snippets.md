---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphmodels "github.com/microsoftgraph/msgraph-beta-sdk-go/models"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphmodels.NewCrossTenantAccessPolicyConfigurationPartner()
automaticUserConsentSettings := graphmodels.NewInboundOutboundPolicyConfiguration()
inboundAllowed := true
automaticUserConsentSettings.SetInboundAllowed(&inboundAllowed) 
outboundAllowed := true
automaticUserConsentSettings.SetOutboundAllowed(&outboundAllowed) 
requestBody.SetAutomaticUserConsentSettings(automaticUserConsentSettings)

result, err := graphClient.Policies().CrossTenantAccessPolicy().Partners().ByPartnerId("crossTenantAccessPolicyConfigurationPartner-tenantId").Patch(context.Background(), requestBody, nil)


```