---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

TenantTag tenantTag = new TenantTag();
tenantTag.displayName = "Support";
tenantTag.description = "Tenants that have purchased extended support";

graphClient.tenantRelationships().managedTenants().tenantTags()
    .buildRequest()
    .post(tenantTag);
```
