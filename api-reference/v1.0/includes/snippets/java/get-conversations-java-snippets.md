---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ConversationCollectionPage conversations = graphClient.groups("{id}").conversations()
    .buildRequest()
    .get();
```
