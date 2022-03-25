---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

UnifiedRoleEligibilityScheduleCollectionPage roleEligibilitySchedules = graphClient.roleManagement().directory().roleEligibilitySchedules()
    .buildRequest()
    .get();
```
