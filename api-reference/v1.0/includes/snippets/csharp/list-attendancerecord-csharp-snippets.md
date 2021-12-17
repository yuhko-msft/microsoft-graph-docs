---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

GraphServiceClient graphClient = new GraphServiceClient( authProvider );

var attendanceRecords = await graphClient.Me.OnlineMeetings["{onlineMeeting-id}"].AttendanceReports.C9b6db1c-d5eb-427d-a5c0-20088d9b22d7.AttendanceRecords
	.Request()
	.GetAsync();

```