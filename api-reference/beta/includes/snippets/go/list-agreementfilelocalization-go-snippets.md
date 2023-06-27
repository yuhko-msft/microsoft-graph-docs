---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphidentitygovernance "github.com/microsoftgraph/msgraph-beta-sdk-go/identitygovernance"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphidentitygovernance.IdentityGovernanceTermsOfUseAgreementItemRequestBuilderGetQueryParameters{
	Expand: [] string {"files"},
}
configuration := &graphidentitygovernance.IdentityGovernanceTermsOfUseAgreementItemRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.IdentityGovernance().TermsOfUse().Agreements().ByAgreementId("agreement-id").Get(context.Background(), configuration)


```