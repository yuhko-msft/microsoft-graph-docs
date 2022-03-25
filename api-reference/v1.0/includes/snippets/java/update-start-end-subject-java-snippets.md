---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

OnlineMeeting onlineMeeting = new OnlineMeeting();
onlineMeeting.startDateTime = OffsetDateTimeSerializer.deserialize("2020-09-09T17:33:30.8546353-04:00");
onlineMeeting.endDateTime = OffsetDateTimeSerializer.deserialize("2020-09-09T18:03:30.8566356-04:00");
onlineMeeting.subject = "Patch Meeting Subject";

graphClient.me().onlineMeetings("MSpkYzE3Njc0Yy04MWQ5LTRhZGItYmZi")
    .buildRequest()
    .patch(onlineMeeting);
```
