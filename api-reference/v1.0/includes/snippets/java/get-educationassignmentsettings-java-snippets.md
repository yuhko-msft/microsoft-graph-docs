---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

EducationAssignmentSettings educationAssignmentSettings = graphClient.education().classes("f4a941ff-9da6-4707-ba5b-0eae93cad0b4").assignmentSettings()
    .buildRequest()
    .get();
```
