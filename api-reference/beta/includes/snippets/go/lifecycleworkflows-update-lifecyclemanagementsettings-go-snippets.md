---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphmodelsidentitygovernance "github.com/microsoftgraph/msgraph-beta-sdk-go/models/identitygovernance"
	  graphmodels "github.com/microsoftgraph/msgraph-beta-sdk-go/models"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphmodelsidentitygovernance.NewLifecycleManagementSettings()
workflowScheduleIntervalInHours := int32(3)
requestBody.SetWorkflowScheduleIntervalInHours(&workflowScheduleIntervalInHours) 
emailSettings := graphmodels.NewEmailSettings()
senderDomain := "ContosoIndustries.net"
emailSettings.SetSenderDomain(&senderDomain) 
useCompanyBranding := true
emailSettings.SetUseCompanyBranding(&useCompanyBranding) 
requestBody.SetEmailSettings(emailSettings)
additionalData := map[string]interface{}{
	"odataContext" : "https://graph.microsoft.com/beta/$metadata#identityGovernance/lifecycleWorkflows/settings/$entity", 
}
requestBody.SetAdditionalData(additionalData)

result, err := graphClient.IdentityGovernance().LifecycleWorkflows().Settings().Patch(context.Background(), requestBody, nil)


```