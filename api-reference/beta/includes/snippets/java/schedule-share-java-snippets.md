---
description: "Automatically generated file. DO NOT MODIFY"
---

```java

IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

Boolean notifyTeam = true;

Calendar startDateTime = CalendarSerializer.deserialize("08/10/2018 00:00:00");

Calendar endDateTime = CalendarSerializer.deserialize("15/10/2018 00:00:00");

graphClient.teams("{teamId}").schedule()
	.share(notifyTeam,startDateTime,endDateTime)
	.buildRequest()
	.post();

```