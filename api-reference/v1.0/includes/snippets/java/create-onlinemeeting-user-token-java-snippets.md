---
description: "Automatically generated file. DO NOT MODIFY"
---

```java

IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

OnlineMeeting onlineMeeting = new OnlineMeeting();
onlineMeeting.startDateTime = "2019-07-13T00:30:34.2444915+03:00";
onlineMeeting.endDateTime = "2019-07-13T01:00:34.2464912+03:00";
onlineMeeting.subject = "User Token Meeting";

graphClient.me().onlineMeetings()
	.buildRequest()
	.post(onlineMeeting);

```