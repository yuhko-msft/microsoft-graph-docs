---
title: "iosHomeScreenFolder resource type"
description: "A folder containing pages of apps and web clips on the Home Screen."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosHomeScreenFolder resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A folder containing pages of apps and web clips on the Home Screen.


Inherits from [iosHomeScreenItem](../resources/ioshomescreenitem.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the app Inherited from [iosHomeScreenItem](../resources/ioshomescreenitem.md).|
|pages|[iosHomeScreenFolderPage](../resources/ioshomescreenfolderpage.md) collection|Pages of Home Screen Layout Icons which must be applications or web clips. This collection can contain a maximum of 500 elements.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosHomeScreenFolder"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosHomeScreenFolder",
  "displayName": "String",
  "pages": [
    {
      "@odata.type": "microsoft.graph.iosHomeScreenFolderPage"
    }
  ]
}
```

