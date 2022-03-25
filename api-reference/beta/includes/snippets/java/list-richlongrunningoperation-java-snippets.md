---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

RichLongRunningOperationCollectionPage operations = graphClient.sites("{site-ID}").operations()
    .buildRequest()
    .get();
```
