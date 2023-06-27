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


requestBody := graphmodels.NewWorkbookChartFont()
bold := true
requestBody.SetBold(&bold) 
color := "color-value"
requestBody.SetColor(&color) 
italic := true
requestBody.SetItalic(&italic) 
name := "name-value"
requestBody.SetName(&name) 
size := float64(99)
requestBody.SetSize(&size) 
underline := "underline-value"
requestBody.SetUnderline(&underline) 

result, err := graphClient.Drives().ByDriveId("drive-id").Items().ByItemId("driveItem-id").Workbook().Worksheets().ByWorksheetId("workbookWorksheet-id").Charts().ByChartId("workbookChart-id").Axes().ValueAxis().Format().Font().Patch(context.Background(), requestBody, nil)


```