---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

CustomSecurityAttributeDefinition customSecurityAttributeDefinition = new CustomSecurityAttributeDefinition();
customSecurityAttributeDefinition.status = "Deprecated";

graphClient.directory().customSecurityAttributeDefinitions("Engineering_Project")
    .buildRequest()
    .patch(customSecurityAttributeDefinition);
```
