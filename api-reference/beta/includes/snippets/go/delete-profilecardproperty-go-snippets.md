---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



graphClient.Organization().ByOrganization().Id("organization-id").Settings().ProfileCardProperties().ByProfileCardPropertieId("profileCardProperty-id").Delete(context.Background(), nil)


```