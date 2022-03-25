---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

WebAccount webAccount = new WebAccount();
webAccount.description = "My Github contributions!";
webAccount.userId = "innocenty.popov";
ServiceInformation service = new ServiceInformation();
service.name = "GitHub";
service.webUrl = "https://github.com";
webAccount.service = service;

graphClient.me().profile().webAccounts()
    .buildRequest()
    .post(webAccount);
```
