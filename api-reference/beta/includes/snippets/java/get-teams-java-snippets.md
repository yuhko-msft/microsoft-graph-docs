---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

TeamCollectionPage teams = graphClient.teams()
    .buildRequest()
    .filter("displayName eq 'A Contoso Team'")
    .select("id,description")
    .get();
```
