---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

WorkbookRange workbookRange = graphClient.drive().root().workbook().worksheets("{id}")
    .range()
    .rowsAbove(WorkbookRangeRowsAboveParameterSet
        .newBuilder()
        .withCount(2)
        .build())
    .buildRequest()
    .get();
```
