---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

LinkedList<Option> requestOptions = new LinkedList<Option>();
requestOptions.add(new HeaderOption("Authorization", "Bearer {Token}"));

SynchronizationSchema synchronizationSchema = graphClient.servicePrincipals("{servicePrincipalId}").synchronization().jobs("{jobId}").schema()
    .buildRequest( requestOptions )
    .get();
```
