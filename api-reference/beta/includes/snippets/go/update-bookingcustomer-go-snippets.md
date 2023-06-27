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


requestBody := graphmodels.NewBookingCustomer()
displayName := "Adele"
requestBody.SetDisplayName(&displayName) 
emailAddress := "adele@relecloud.com"
requestBody.SetEmailAddress(&emailAddress) 

result, err := graphClient.BookingBusinesses().ByBookingBusinesseId("bookingBusiness-id").Customers().ByCustomerId("bookingCustomer-id").Patch(context.Background(), requestBody, nil)


```