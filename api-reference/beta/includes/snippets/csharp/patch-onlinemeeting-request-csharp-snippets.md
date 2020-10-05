---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

GraphServiceClient graphClient = new GraphServiceClient( authProvider );

var onlineMeeting = new OnlineMeeting
{
	StartDateTime = DateTimeOffset.Parse("2020-09-10T00:33:30.8546353+03:00"),
	EndDateTime = DateTimeOffset.Parse("2020-09-10T01:03:30.8566356+03:00"),
	Subject = "Patch Meeting Subject"
};

await graphClient.Me.OnlineMeetings["{id}"]
	.Request()
	.UpdateAsync(onlineMeeting);

```