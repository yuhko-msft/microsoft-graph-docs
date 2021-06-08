---
author: krtsoi
description: "The PagingView resource representing whether items are displayed across multiple pages
ms.date: 06/08/2021
title: PagingView
localization_priority: Normal
ms.prod: "sharepoint"
doc_type: resourcePageType
---
# PagingView resource

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The **pagingView** resource on a [listView] indicates view supports displaying items across multiple pages.

## JSON representation

Here is a JSON representation of a **pagingView** resource.
<!-- { "blockType": "resource", "@odata.type": "microsoft.graph.pagingView" } -->

```json
{
  "rowLimit": 30
}
```

## Properties

| Property name | Type    | Description
|:--------------|:--------|:---------------------------------------
| **rowLimit**  | integer | Specifies the limit for the number of items that the list view will return per page.

[listView]: listView.md

<!-- {
  "type": "#page.annotation",
  "description": "",
  "keywords": "",
  "section": "documentation",
  "tocPath": "Resources/PagingView"
} -->
