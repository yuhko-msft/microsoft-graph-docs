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



graphClient.Policies().MobileDeviceManagementPolicies().ByMobileDeviceManagementPolicieId("mobilityManagementPolicy-id").IncludedGroups().ByIncludedGroupId("group-id").Ref().Delete(context.Background(), nil)


```