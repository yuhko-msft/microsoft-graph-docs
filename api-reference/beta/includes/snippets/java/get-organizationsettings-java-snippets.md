---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

OrganizationSettings organizationSettings = graphClient.organization("a9f3c90b-04fd-4504-a302-47672bbca6c8").settings()
    .buildRequest()
    .get();
```
