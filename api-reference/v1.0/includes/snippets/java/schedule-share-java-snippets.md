---
description: "Automatically generated file. DO NOT MODIFY"
---

```java

IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

boolean notifyTeam = true;

int startDateTime = 08/10/2018 00:00:00;

int endDateTime = 15/10/2018 00:00:00;

graphClient.teams("{teamId}").schedule()
	.share(notifyTeam,startDateTime,endDateTime)
	.buildRequest()
	.post();

```