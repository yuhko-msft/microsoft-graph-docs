---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

DriveItemDeltaCollectionPage delta = graphClient.me().drive().root()
    .delta(DriveItemDeltaParameterSet
        .newBuilder()
        .withToken("1230919asd190410jlka")
        .build())
    .buildRequest()
    .get();
```
