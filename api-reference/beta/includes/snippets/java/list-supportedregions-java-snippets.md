---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

CloudPcSupportedRegionCollectionPage supportedRegions = graphClient.deviceManagement().virtualEndpoint().supportedRegions()
    .buildRequest()
    .get();
```
