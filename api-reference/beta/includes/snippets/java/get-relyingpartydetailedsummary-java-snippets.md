---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ReportRootGetRelyingPartyDetailedSummaryCollectionPage getRelyingPartyDetailedSummary = graphClient.reports()
    .getRelyingPartyDetailedSummary(ReportRootGetRelyingPartyDetailedSummaryParameterSet
        .newBuilder()
        .withPeriod("period_value")
        .build())
    .buildRequest()
    .get();
```
