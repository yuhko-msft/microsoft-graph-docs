---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

TemporaryAccessPassAuthenticationMethod temporaryAccessPassAuthenticationMethod = graphClient.users("kim@contoso.com").authentication().temporaryAccessPassMethods("30fd0dfc-0dfc-30fd-fc0d-fd30fc0dfd30")
    .buildRequest()
    .get();
```
