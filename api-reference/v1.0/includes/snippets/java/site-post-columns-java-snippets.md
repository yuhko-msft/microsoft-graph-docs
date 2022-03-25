---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ColumnDefinition columnDefinition = new ColumnDefinition();
columnDefinition.description = "test";
columnDefinition.enforceUniqueValues = false;
columnDefinition.hidden = false;
columnDefinition.indexed = false;
columnDefinition.name = "Title";
TextColumn text = new TextColumn();
text.allowMultipleLines = false;
text.appendChangesToExistingText = false;
text.linesForEditing = 0;
text.maxLength = 255;
columnDefinition.text = text;

graphClient.sites("{site-id}").columns()
    .buildRequest()
    .post(columnDefinition);
```
