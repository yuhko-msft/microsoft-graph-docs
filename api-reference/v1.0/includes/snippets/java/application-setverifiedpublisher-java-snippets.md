---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

String verifiedPublisherId = "1234567";

graphClient.applications("{id}")
    .setVerifiedPublisher(ApplicationSetVerifiedPublisherParameterSet
        .newBuilder()
        .withVerifiedPublisherId(verifiedPublisherId)
        .build())
    .buildRequest()
    .post();
```
