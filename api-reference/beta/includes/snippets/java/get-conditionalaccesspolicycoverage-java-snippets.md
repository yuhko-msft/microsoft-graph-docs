---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ConditionalAccessPolicyCoverage conditionalAccessPolicyCoverage = graphClient.tenantRelationships().managedTenants().conditionalAccessPolicyCoverages("{conditionalAccessPolicyCoverageId}")
    .buildRequest()
    .get();
```
