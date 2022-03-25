---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ConditionalAccessPolicyCoverageCollectionPage conditionalAccessPolicyCoverages = graphClient.tenantRelationships().managedTenants().conditionalAccessPolicyCoverages()
    .buildRequest()
    .get();
```
