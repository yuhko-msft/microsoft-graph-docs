---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ManagedDeviceComplianceTrend managedDeviceComplianceTrend = graphClient.tenantRelationships().managedTenants().managedDeviceComplianceTrends("{managedDeviceComplianceTrendId}")
    .buildRequest()
    .get();
```
