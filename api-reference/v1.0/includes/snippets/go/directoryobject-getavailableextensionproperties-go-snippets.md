---
description: "Automatically generated file. DO NOT MODIFY"
---

```go

//THE GO SDK IS IN PREVIEW. NON-PRODUCTION USE ONLY
graphClient := msgraphsdk.NewGraphServiceClient(requestAdapter)

requestBody := msgraphsdk.NewIsSyncedFromOnPremisesRequestBody()
isSyncedFromOnPremises := "Boolean"
requestBody.SetIsSyncedFromOnPremises(&isSyncedFromOnPremises)
options := &msgraphsdk.GetAvailableExtensionPropertiesRequestBuilderPostOptions{
	Body: requestBody,
}
result, err := graphClient.DirectoryObjects().GetAvailableExtensionProperties().Post(options)


```