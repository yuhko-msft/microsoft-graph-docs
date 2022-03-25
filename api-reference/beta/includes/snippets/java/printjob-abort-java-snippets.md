---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

graphClient.print().printers("{id}").jobs("{id}")
    .abort(PrintJobAbortParameterSet
        .newBuilder()
        .withReason(null)
        .build())
    .buildRequest()
    .post();
```
