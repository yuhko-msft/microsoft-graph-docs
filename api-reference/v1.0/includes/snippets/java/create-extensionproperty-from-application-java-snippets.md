---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ExtensionProperty extensionProperty = new ExtensionProperty();
extensionProperty.name = "extensionName";
extensionProperty.dataType = "string";
LinkedList<String> targetObjectsList = new LinkedList<String>();
targetObjectsList.add("Application");
extensionProperty.targetObjects = targetObjectsList;

graphClient.applications("{id}").extensionProperties()
    .buildRequest()
    .post(extensionProperty);
```
