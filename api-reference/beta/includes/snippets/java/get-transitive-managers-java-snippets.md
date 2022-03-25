---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

LinkedList<Option> requestOptions = new LinkedList<Option>();
requestOptions.add(new HeaderOption("ConsistencyLevel", "eventual"));

User user = graphClient.me()
    .buildRequest( requestOptions )
    .expand("manager($levels=max;$select=id,displayName)")
    .select("id,displayName")
    .get();
```
