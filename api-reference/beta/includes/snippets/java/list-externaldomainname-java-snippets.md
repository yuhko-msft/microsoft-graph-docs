---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ExternalDomainNameCollectionPage domains = graphClient.directory().federationConfigurations().microsoft.graph.samlOrWsFedExternalDomainFederation("f1e11a04-0244-4592-99df-b01cfaadce15").domains()
    .buildRequest()
    .get();
```
