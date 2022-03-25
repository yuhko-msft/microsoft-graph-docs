---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

CloudPcOverviewCollectionPage cloudPcsOverview = graphClient.tenantRelationships().managedTenants().cloudPcsOverview()
    .buildRequest()
    .get();
```
