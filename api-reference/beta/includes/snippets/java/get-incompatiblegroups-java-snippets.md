---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

GroupCollectionPage incompatibleGroups = graphClient.identityGovernance().entitlementManagement().accessPackages("{id}").incompatibleGroups()
    .buildRequest()
    .get();
```
