---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



graphClient.Print().Printers().ByPrinterId("printer-id").Jobs().ByJobId("printJob-id").Documents().ByDocumentId("printDocument-id").Value().Get(context.Background(), nil)


```