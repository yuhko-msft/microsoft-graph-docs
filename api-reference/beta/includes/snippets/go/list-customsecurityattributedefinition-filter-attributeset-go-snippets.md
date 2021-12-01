---
description: "Automatically generated file. DO NOT MODIFY"
---

```go

//THE GO SDK IS IN PREVIEW. NON-PRODUCTION USE ONLY
graphClient := msgraphsdk.NewGraphServiceClient(requestAdapter)

requestParameters := &msgraphsdk.CustomSecurityAttributeDefinitionsRequestBuilderGetQueryParameters{
	Filter: "attributeSet+eq+'Engineering'%20and%20status+eq+'Available'%20and%20type+eq+'String'",
}
options := &msgraphsdk.CustomSecurityAttributeDefinitionsRequestBuilderGetOptions{
	Q: requestParameters,
}
result, err := graphClient.Directory().CustomSecurityAttributeDefinitions().Get(options)


```