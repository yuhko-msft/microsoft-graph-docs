---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphidentityprotection "github.com/microsoftgraph/msgraph-beta-sdk-go/identityprotection"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



requestFilter := "riskEventType eq 'investigationsThreatIntelligence' or riskLevel eq 'medium'"

requestParameters := &graphidentityprotection.IdentityProtectionServicePrincipalRiskDetectionsRequestBuilderGetQueryParameters{
	Filter: &requestFilter,
}
configuration := &graphidentityprotection.IdentityProtectionServicePrincipalRiskDetectionsRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.IdentityProtection().ServicePrincipalRiskDetections().Get(context.Background(), configuration)


```