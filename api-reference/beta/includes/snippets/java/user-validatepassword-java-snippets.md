---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

String password = "1234567890";

graphClient.users()
    .validatePassword(UserValidatePasswordParameterSet
        .newBuilder()
        .withPassword(password)
        .build())
    .buildRequest()
    .post();
```
