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



result, err := graphClient.Directory().CustomSecurityAttributeDefinitions().ByCustomSecurityAttributeDefinitionId("customSecurityAttributeDefinition-id").AllowedValues().Get(context.Background(), nil)


```