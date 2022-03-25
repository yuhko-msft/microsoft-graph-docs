---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

PersonCertificationCollectionPage certifications = graphClient.me().profile().certifications()
    .buildRequest()
    .get();
```
