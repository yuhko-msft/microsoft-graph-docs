---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

CloudPcServicePlanCollectionPage servicePlans = graphClient.deviceManagement().virtualEndpoint().servicePlans()
    .buildRequest()
    .get();
```
