---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ReportRootGetAzureADApplicationSignInSummaryCollectionPage getAzureADApplicationSignInSummary = graphClient.reports()
    .getAzureADApplicationSignInSummary(ReportRootGetAzureADApplicationSignInSummaryParameterSet
        .newBuilder()
        .withPeriod("D7")
        .build())
    .buildRequest()
    .get();
```
