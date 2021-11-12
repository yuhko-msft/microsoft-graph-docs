---
title: "actionUrl resource type"
description: "The link associated with an actionStep"
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: resourcePageType
---

# actionUrl resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**The link associated with an [actionStep](../resources/actionStep.md).**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Text to indicate where the link will navigate to.|
|url|String|The URL of the actionURL.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.actionUrl"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.actionUrl",
  "displayName": "String",
  "url": "String"
}
```

