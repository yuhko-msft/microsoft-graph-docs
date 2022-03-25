---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ManagementIntent managementIntent = graphClient.tenantRelationships().managedTenants().managementIntents("{managementIntentId}")
    .buildRequest()
    .get();
```
