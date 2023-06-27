---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphmodelsmanagedtenants "github.com/microsoftgraph/msgraph-beta-sdk-go/models/managedtenants"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphmodelsmanagedtenants.NewTenantCustomizedInformation()
tenantId := "String"
requestBody.SetTenantId(&tenantId) 


tenantContactInformation := graphmodelsmanagedtenants.NewTenantContactInformation()
name := "String"
tenantContactInformation.SetName(&name) 
title := "String"
tenantContactInformation.SetTitle(&title) 
email := "String"
tenantContactInformation.SetEmail(&email) 
phone := "String"
tenantContactInformation.SetPhone(&phone) 
notes := "String"
tenantContactInformation.SetNotes(&notes) 

contacts := []graphmodelsmanagedtenants.TenantContactInformationable {
	tenantContactInformation,
}
requestBody.SetContacts(contacts)
website := "String"
requestBody.SetWebsite(&website) 

result, err := graphClient.TenantRelationships().ManagedTenants().TenantsCustomizedInformation().ByTenantsCustomizedInformation().Id("tenantCustomizedInformation-id").Patch(context.Background(), requestBody, nil)


```