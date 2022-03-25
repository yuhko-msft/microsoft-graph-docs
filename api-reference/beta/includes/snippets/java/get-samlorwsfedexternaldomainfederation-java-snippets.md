---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

SamlOrWsFedExternalDomainFederationCollectionPage samlOrWsFedExternalDomainFederation = graphClient.directory().federationConfigurations().graph.samlOrWsFedExternalDomainFederation()
    .buildRequest()
    .filter("domains/any(x: x/id eq 'contoso.com')")
    .get();
```
