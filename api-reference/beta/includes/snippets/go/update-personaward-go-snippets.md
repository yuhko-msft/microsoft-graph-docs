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


requestBody := graphmodels.NewPersonAward()
issuingAuthority := "International Association of Branding Management"
requestBody.SetIssuingAuthority(&issuingAuthority) 
thumbnailUrl := "https://iabm.io/sdhdfhsdhshsd.jpg"
requestBody.SetThumbnailUrl(&thumbnailUrl) 

result, err := graphClient.Users().ByUserId("user-id").Profile().Awards().ByAwardId("personAward-id").Patch(context.Background(), requestBody, nil)


```