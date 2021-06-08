---
author: krtsoi
description: "The MobileView resource representing a mobile view of a list"
ms.date: 06/08/2021
title: MobileView
localization_priority: Normal
ms.prod: "sharepoint"
doc_type: resourcePageType
---
# MobileView resource

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The **mobile** resource on a [listView] indicates the list supports a mobile view.

## JSON representation

Here is a JSON representation of a **mobile** resource.
<!-- { "blockType": "resource", "@odata.type": "microsoft.graph.mobileView" } -->

```json
{
  "isDefault": true
}
```

## Properties

| Property name   | Type    | Description
|:----------------|:--------|:---------------------------------------
| **isDefault**   | boolean | Indicates whether the list view is the default mobile list view.

[listView]: listView.md

<!-- {
  "type": "#page.annotation",
  "description": "",
  "keywords": "",
  "section": "documentation",
  "tocPath": "Resources/MobileView"
} -->
