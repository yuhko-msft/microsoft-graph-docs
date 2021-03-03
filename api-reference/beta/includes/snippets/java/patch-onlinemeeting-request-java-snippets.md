---
description: "Automatically generated file. DO NOT MODIFY"
---

```java

IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

OnlineMeeting onlineMeeting = new OnlineMeeting();
onlineMeeting.startDateTime = CalendarSerializer.deserialize("2020-09-10T00:33:30.8546353+03:00");
onlineMeeting.endDateTime = CalendarSerializer.deserialize("2020-09-10T01:03:30.8566356+03:00");
onlineMeeting.subject = "Patch Meeting Subject";

graphClient.me().onlineMeetings("{id}")
	.buildRequest()
	.patch(onlineMeeting);

```