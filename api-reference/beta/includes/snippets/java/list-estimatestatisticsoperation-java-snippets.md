---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

EstimateStatisticsOperation estimateStatisticsOperation = graphClient.compliance().ediscovery().cases("{caseId}").sourceCollections("95bdbf84f02f4bdaafbbb2fe945a4962").lastEstimateStatisticsOperation()
    .buildRequest()
    .get();
```
