---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

OutlookUserSupportedTimeZonesCollectionPage supportedTimeZones = graphClient.me().outlook()
    .supportedTimeZones(OutlookUserSupportedTimeZonesParameterSet
        .newBuilder()
        .withTimeZoneStandard(microsoft.graph.timeZoneStandard'Iana')
        .build())
    .buildRequest()
    .get();
```
