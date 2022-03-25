---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

TenantCollectionPage tenants = graphClient.tenantRelationships().managedTenants().tenants()
    .buildRequest()
    .get();
```
