---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

graphClient.roleManagement().directory().roleAssignmentScheduleRequests("15fec3d4-64b1-4b03-beb7-f1ba6dddf6cc")
    .cancel()
    .buildRequest()
    .post();
```
