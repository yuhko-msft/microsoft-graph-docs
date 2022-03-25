---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ApplicationSignInDetailedSummaryCollectionPage applicationSignInDetailedSummary = graphClient.reports().applicationSignInDetailedSummary()
    .buildRequest()
    .get();
```
