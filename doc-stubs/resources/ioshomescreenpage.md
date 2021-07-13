---
title: "iosHomeScreenPage resource type"
description: "A page containing apps, folders, and web clips on the Home Screen."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosHomeScreenPage resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A page containing apps, folders, and web clips on the Home Screen.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the page|
|icons|[iosHomeScreenItem](../resources/ioshomescreenitem.md) collection|A list of apps, folders, and web clips to appear on a page. This collection can contain a maximum of 500 elements.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosHomeScreenPage"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosHomeScreenPage",
  "displayName": "String",
  "icons": [
    {
      "@odata.type": "microsoft.graph.iosHomeScreenApp"
    }
  ]
}
```

