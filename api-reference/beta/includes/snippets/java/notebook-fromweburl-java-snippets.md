---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

String webUrl = "webUrl value";

graphClient.me().onenote().notebooks()
    .getNotebookFromWebUrl(NotebookGetNotebookFromWebUrlParameterSet
        .newBuilder()
        .withWebUrl(webUrl)
        .build())
    .buildRequest()
    .post();
```
