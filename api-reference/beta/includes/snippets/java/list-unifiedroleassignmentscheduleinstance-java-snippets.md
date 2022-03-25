---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

UnifiedRoleAssignmentScheduleInstanceCollectionPage roleAssignmentScheduleInstances = graphClient.roleManagement().directory().roleAssignmentScheduleInstances()
    .buildRequest()
    .get();
```
