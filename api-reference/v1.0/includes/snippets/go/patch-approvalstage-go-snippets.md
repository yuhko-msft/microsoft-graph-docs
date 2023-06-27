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


requestBody := graphmodels.NewApprovalStage()
reviewResult := "Approve"
requestBody.SetReviewResult(&reviewResult) 
justification := "OK"
requestBody.SetJustification(&justification) 

result, err := graphClient.IdentityGovernance().EntitlementManagement().AccessPackageAssignmentApprovals().ByAccessPackageAssignmentApprovalId("approval-id").Stages().ByStageId("approvalStage-id").Patch(context.Background(), requestBody, nil)


```