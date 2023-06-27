---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

// Code snippets are only available for the latest version. Current version is 5.x

var graphClient = new GraphServiceClient(requestAdapter);

var requestBody = new Microsoft.Graph.Solutions.BookingBusinesses.Item.Appointments.Item.Cancel.CancelPostRequestBody
{
	CancellationMessage = "Your appointment has been successfully cancelled. Please call us again.",
};
await graphClient.Solutions.BookingBusinesses["{bookingBusiness-id}"].Appointments["{bookingAppointment-id}"].Cancel.PostAsync(requestBody);


```