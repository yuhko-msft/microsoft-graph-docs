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


requestBody := graphmodels.NewDriveItem()
name := "New Folder"
requestBody.SetName(&name) 
folder := graphmodels.NewFolder()
requestBody.SetFolder(folder)
additionalData := map[string]interface{}{
	"microsoftGraphConflictBehavior" : "rename", 
}
requestBody.SetAdditionalData(additionalData)

result, err := graphClient.Drives().ByDriveId("drive-id").Items().ByItemId("driveItem-id").Children().Post(context.Background(), requestBody, nil)


```