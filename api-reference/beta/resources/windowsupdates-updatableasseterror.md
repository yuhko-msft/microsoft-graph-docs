---
title: "updatableAssetError resource type"
description: "**TODO: Add Description**"
author: "Alice-at-Microsoft"
localization_priority: Normal
ms.prod: "w10"
doc_type: resourcePageType
---

# updatableAssetError resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

An error that prevent the device from being enrolled in update management or receving deployed content.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|A description of the error.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsUpdates.updatableAssetError"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.updatableAssetError",
  "description": "String"
}
```

