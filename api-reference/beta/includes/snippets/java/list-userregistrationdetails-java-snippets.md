---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

UserRegistrationDetailsCollectionPage userRegistrationDetails = graphClient.reports().authenticationMethods().userRegistrationDetails()
    .buildRequest()
    .get();
```
