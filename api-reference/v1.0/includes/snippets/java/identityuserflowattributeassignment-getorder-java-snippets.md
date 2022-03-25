---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

AssignmentOrder assignmentOrder = graphClient.identity().b2xUserFlows("B2X_1_Partner").userAttributeAssignments()
    .getOrder()
    .buildRequest()
    .get();
```
