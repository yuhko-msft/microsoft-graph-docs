---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  graphdrives "github.com/microsoftgraph/msgraph-sdk-go/drives"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestBody := graphdrives.NewCreateLinkPostRequestBody()
type := "embed"
requestBody.SetType(&type) 

result, err := graphClient.Drives().ByDriveId("drive-id").Items().ByItemId("driveItem-id").CreateLink().Post(context.Background(), requestBody, nil)


```